import java.util.HashSet;
import java.util.Set;

public class EquationValidator {
    
    private Pyramid pyramid; //get the operation and number stored inside the letter the user inputs 
    private int target; // to check against target 

    private Set<String> submittedAnswers; //so there arent any duplicate answers, if so then -1pt 

    public EquationValidator(Pyramid pyramid, int target) {
        this.pyramid = pyramid;
        this.target = target;

        submittedAnswers = new HashSet<>();
    }

    //method checks if the answers submitted is unique and is valid 
    public boolean validateEquation(String input){

        input = input.toUpperCase().replaceAll("\\s+", ""); //coverts a b c to ABC

        if(submittedAnswers.contains(input)){
            System.out.println("Equation already submitted");
            return false; 
        }

        if(input.length() !=3){
            System.out.println("Must choose 3 squares");
            return false; 
        }

        // So that users dont enter the same square
        Set<Character> usedLabels = new HashSet<>();

        for (char character : input.toCharArray()) {

            if (usedLabels.contains(character)) {

                System.out.println("Select 3 different squares.");

                return false;
            }

            usedLabels.add(character);
        }
        
        try {
            String equation = buildEquation(input);
            int result = calEquation(equation);

            submittedAnswers.add(input);

            System.out.println("Equation: " + equation);
            System.out.println("Result: " + result);

            return result == target;
        } 
        catch (Exception e) {
            System.out.println("Invalid equation.");
            return false;
        }
    }

    //helper method to ffind a square in a list
    private Square findSquare(char label){
        for (Square square : pyramid.getSquares()){
            if(square.getLabel() == label){
                return square; 
            }
        }
        return null; 
    }

     private String buildEquation(String input){
        StringBuilder equation = new StringBuilder(); 

        for (int i = 0; i < input.length(); i++) {
            char label = input.charAt(i); 
            Square square = findSquare(label); 

            if(square == null){
                 throw new IllegalArgumentException("Invalid square.");
            }

            if(i == 0){
                equation.append(square.getValue());
            }
            else{
                equation.append(square.getOperator());
                equation.append(square.getValue());
            }
        }

        return equation.toString(); 
     }

     private int calEquation(String equation){

        int result = Character.getNumericValue(equation.charAt(0)); 

        for(int i = 1; i < equation.length(); i+=2){

            char operator = equation.charAt(i);
            int num = Character.getNumericValue(equation.charAt(i + 1));

            switch (operator) {
                case '+':
                    result += num;
                    break;

                case '-':
                    result -= num;
                    break;

                case '*':
                    result *= num;
                    break;

                case '/':
                    if (num == 0) {
                        throw new ArithmeticException("Division by zero");
                    }

                    result /= num;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
        }

        return result; 
    }



}
