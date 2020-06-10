
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//import java.util.Scanner;
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private int position;
    private Jar jar;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        position = 0;
        jar = new Jar();
        name = Global.getLine("Enter player's name: ");
        
        
    }
    
    public Player(String name_)
    {
        position = 0;
        jar = new Jar();
        name = name_;
    }
    
    void move(int place)
    {
        position += place;
        jar.position(position);
    }
    
    void pickUp(Jar jar_)
    {        
        jar = new Jar(jar_);
        jar_.moveTo(jar_);
        //jar_.stone = null;
    }
    
    public String getName()
    {
        return name;
    }
}
