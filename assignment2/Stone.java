
/**
 * Write a description of class Stone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Stone
{
    // instance variables - replace the example below with your own
    public String name;
    private int weight;

    /**
     * Constructor for objects of class Stone
     */
    public Stone()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter stone name: ");
        name = keyboard.nextLine();
        
        System.out.print("Enter stone weight: ");
        weight = keyboard.nextInt();
        
        Global.keyboard.nextLine();
    }
    
    public Stone(String name_, int weight_)
    {
        name = name_;
        weight = weight_;
    }
}
