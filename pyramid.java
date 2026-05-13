
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

    public Pyramid(List<Square> squares) {
        this.squares = squares;
    }

    public List<Square> getSquares(){
        return squares; 
    }

    @Override
    public String toString() {
        return squares.toString();
    }
}
