
import java.util.Random;

/**
 * Represents a class that generates an entire round 
 * </p>
 *
 * @author  toothpastenorangejuice
 * @version 1.0
 * @since   2026-05-11
 */
public class RoundGenerator {
    
    private PyramidGenerator pyramidGenerator; 
    private Random ran; 

    public RoundGenerator(){
        pyramidGenerator = new PyramidGenerator(); 
        ran = new Random(); 
    }

    public Round generateRound(){

        Pyramid pyramid = pyramidGenerator.generatePyramid(); 
        int target = ran.nextInt(50); 

        return new Round(pyramid, target); 
    }



}
