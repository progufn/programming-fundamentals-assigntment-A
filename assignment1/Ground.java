/**
 * Write a description of class Ground here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//import java.util.Scanner;
public class Ground
{
    /**
     * Constructor for objects of class Ground
     */
       private Player player;
       private Jar jar1;
       private Jar jar2;
       private Jar jar3; 
       private Chest chest;
       
    public Ground()
    {
       Stone stone;
       String name;        
        
       //Scanner keyboard = new Scanner(System.in);
       name = Global.getLine("Enter player's name: ");
       Global.keyboard.nextLine();
       player = new Player(name);
       jar1 = new Jar(1, initJar());
       jar2 = new Jar(2, initJar());       
       jar3 = new Jar(3, initJar());
       
       //new
       chest = new Chest();
    }
   
    public Stone initJar()
    {
       Stone out;
       
       String name = Global.getLine("Enter stone name: ");
        
       System.out.print("Enter stone weight: ");
       int weight = Global.keyboard.nextInt();
       
       Global.keyboard.nextLine();
       
       out = new Stone(name, weight);
       return out;
    }
    
    public boolean isChestUnlocked()
    {        
        int C;
        if(chest.jar3.stone == null)
        {
             C = 1;
        }
        else
        C = chest.jar3.stone.weight;
        //int key = chest.jar1.stone.weight + (chest.jar2.stone.weight * chest.jar3.stone.weight);
        int key = chest.jar1.stone.weight + (chest.jar2.stone.weight * C);
        
        if(key == chest.getCombination())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        String out = player.getName() + "[](0) [" + jar1.stone.stoneName + "#" + jar1.stone.weight 
        + "](1) [" + jar2.stone.stoneName + "#" + jar2.stone.weight + "](2) [" + jar3.stone.stoneName
        + "#" + jar3.stone.weight + "](3) /" + chest.getCombination() + "\\(4)";
/*        out += "[](0) [";
        out += jar1.stone.stoneName;
        out += "#";
        out += jar1.stone.weight;
        out += "](1) [";*/
        return out;
    }
}
