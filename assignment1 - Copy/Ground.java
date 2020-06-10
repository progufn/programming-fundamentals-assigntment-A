/**
 * Write a description of class Ground here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ground
{
    /**
     * Constructor for objects of class Ground
     */
       private Player player;
       private Jar jar1;
       private Jar jar2;
       private Jar jar3; 
    public Ground()
    {
        
       Stone stone;
       int weight;
       String name;        
        
        Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter player's name: ");
       name = Global.keyboard.nextLine();
       
       player = new Player(name);
       
       System.out.print("Enter stone name: ");
       name = Global.keyboard.nextLine();
        
       System.out.print("Enter stone weight: ");
       weight = Global.keyboard.nextInt();
       
       Global.keyboard.nextLine();
       
       stone = new Stone(name, weight);
       jar1 = new Jar(1, stone);
        
       System.out.print("Enter stone name: ");
       name = Global.keyboard.nextLine();
        
       System.out.print("Enter stone weight: ");
       weight = Global.keyboard.nextInt();
       
       Global.keyboard.nextLine();
       
       stone = new Stone(name, weight);
       jar2 = new Jar(2, stone);
        
       System.out.print("Enter stone name: ");
       name = Global.keyboard.nextLine();
        
       System.out.print("Enter stone weight: ");
       weight = Global.keyboard.nextInt();
       
       Global.keyboard.nextLine();
       
       stone = new Stone(name, weight);
       jar3 = new Jar(3, stone);
    }
}
