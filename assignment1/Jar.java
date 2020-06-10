
/**
 * Write a description of class Jar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jar
{
    private int position;
    public Stone stone;
    /**
     * Constructor for objects of class Jar
     */
    public Jar()
    {
        // initialise instance variables
        position = 0;
        stone = null;
    }
    
    public Jar(int pos, Stone stone_)
    {
        position = pos;
        stone = stone_;
    }
    
    public Jar(Jar jar)
    {
        stone = jar.stone;
        position = jar.position;
    }
    
    void position(int pos_)
    {
        position = pos_;
    }
    
    public void moveTo(Jar jar)
    {
        //jar.stone = stone;
        stone = null;
    }
    
}
