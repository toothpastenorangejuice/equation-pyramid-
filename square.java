//
/**
 * Represents a singular tile in the pyramid
 * </p>
 *
 * @author  toothpastenorangejuice
 * @version 1.0
 * @since   2026-05-11
 */ 
public class Square {

    private char label;
    private char operator;
    private int value; 

    public Square(char label, char operator, int value){
        this.label = label; 
        this.operator = operator; 
        this.value = value; 
    }
    
    public char getLabel(){
        return label; 
    }

    public char getOperator() {
        return operator;
    }

    public int getValue() {
        return value;
    }

    //returns a tile in the format example A: + 5 
    @Override
    public String toString() {
        return label + ": " + operator + value;
    }

}
