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
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    
    //Direction the seal is facing
    String facing = "right";
    
    /**
     * Contructor - the code that gets run one time when object is created
     */
    public Seal()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("Images/seal_idle/idle" + i + ".png");
            idleRight[i].scale(100, 70);
        }
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("Images/seal_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 70);
        }
        setImage(idleRight[0]);
    }
    
    /**
     * Animate the seal
     */
    int imageIndex = 0;
    public void animateSeal()
    {
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "right";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "left";
        }
        
        //Remove apple if seal eats it
        eatFood();
        
        //Animate the Seal
        animateSeal();
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
