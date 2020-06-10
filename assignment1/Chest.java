
/**
 * Write a description of class Chest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chest
{
    // instance variables - replace the example below with your own
    private int combination;
    private int position;

    public Jar jar1;
    public Jar jar2;
    public Jar jar3; 
    /**
     * Constructor for objects of class Chest
     */
    public Chest()
    {
        // initialise instance variables
        System.out.print("Enter chest combination (5-10): ");
        combination = Global.keyboard.nextInt();
        position = 4;
        jar1 = new Jar(position, null);
        jar2 = new Jar(position, null);
        jar3 = new Jar(position, null);
    }
    
    public int getCombination()
    {
        return combination;
    }

}
