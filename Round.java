/**
 * Represents a round in the game and stores the target and pyramid here. 
 * </p>
 *
 * @author  toothpastenorangejuice
 * @version 1.0
 * @since   2026-05-11
 */
public class Round {
    
    private Pyramid pyramid; 
    private int target; 

    public Round(Pyramid pyramid, int target){
        pyramid = this.pyramid;
        target = this.target; 
    }

    public Pyramid getPyramid(){
        return pyramid; 
    }

    public int getTarget(){
        return target; 
    }
}
