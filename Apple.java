import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our Seal.
 * 
 * @author Scarlett Ho 
 * @version September 23, 2024
 */
public class Apple extends Actor
{
    private int speed = 1;
    public void act()
    {
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        //Remove apple and input a game over label when food gets to the bottom.
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
