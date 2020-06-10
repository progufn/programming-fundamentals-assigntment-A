/**
 * Write a description of class Global here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Global
{
    // instance variables - replace the example below with your own
    
    public static final Scanner keyboard = new Scanner(System.in);
    /**
     * Constructor for objects of class Global
     */
    public Global()
    {
        // initialise instance variables
        
    }
    
    public static String getLine(String message)
    {
        System.out.print(message);
        return keyboard.nextLine();
    }
}
