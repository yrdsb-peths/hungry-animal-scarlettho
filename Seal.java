import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * New class, Seal, our hero. Main actor of the game.
 * 
 * @author Scarlett Ho
 * @version September 23, 2024
 */
public class Seal extends Actor
{
    GreenfootSound eatingSound = new GreenfootSound("eating-sound-effect-36186.mp3");
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        //Remove apple if seal eats it
        eatFood();
    }
    /**
     * Eats the apple and then spawns a new apple.
     */
    public void eatFood()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld)getWorld();
            world.createApple();
            world.increaseScore();
            eatingSound.play();
        }
    }
}
