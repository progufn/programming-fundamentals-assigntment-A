
/**
 * Write a description of class Stone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//import java.util.Scanner;
public class Stone
{
    // instance variables - replace the example below with your own
    public String stoneName;
    public int weight;

    /**
     * Constructor for objects of class Stone
     */
    public Stone()
    {
        stoneName = Global.getLine("Enter stone name: ");
        Global.keyboard.nextLine();
        
        System.out.print("Enter stone weight: ");
        weight = Global.keyboard.nextInt();
        
        //Global.keyboard.nextLine();
    }
    
    public Stone(String name_, int weight_)
    {
        stoneName = name_;
        weight = weight_;
    }
    
    public int getWeight()
    {
        return weight;
    }
}
