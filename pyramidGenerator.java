import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a class to create random squares with random operators 
 * </p>
 *
 * @author  toothpastenorangejuice
 * @version 1.0
 * @since   2026-05-11
 */

public class PyramidGenerator {

    private Random ranNum = new Random(); 
    private char [] operators = {'+', '-', '*', '/'}; 

    char label = 'A'; 

    public Pyramid generatePyramid(){
        
        List<Square> squares = new ArrayList<>(); 

        for(int i = 0; i < 10; i++){

            char op = operators[ranNum.nextInt(operators.length)]; //generates a random operator 
            int num = ranNum.nextInt(10); //generates a random number 

            squares.add(new Square(label, op, num)); 

            label++; //increments the label to the next letter. 
        }

        return new Pyramid(squares); 
    }

    public static void main(String[] args) {

        PyramidGenerator generator = new PyramidGenerator();
        Pyramid pyramid = generator.generatePyramid();
        System.out.println(pyramid);
    }
}
