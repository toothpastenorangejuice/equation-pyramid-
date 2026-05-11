
import java.util.List;

/**
 * Represents a collection of 10 square 
 * </p>
 *
 * @author  toothpastenorangejuice
 * @version 1.0
 * @since   2026-05-11
 */
public class Pyramid {
    
    private List<Square> squares; 
    
    private void addSquare(Square square){
        squares.add(square); 
    }

    public List<Square> getSquares(){
        return squares; 
    }

    public void display(){
        for (Square square: squares){
            System.out.println(square);
        }
    }
}
