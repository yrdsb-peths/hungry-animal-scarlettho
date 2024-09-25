import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author scarlett Ho
 * @version September 24, 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Seal", 80);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2 + 45, getHeight()/2);
        prepare();
    }

    /**
     * The main vorld act loop
     */
    public void act()
    {
        //Start the game if user presses space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Seal seal = new Seal();
        addObject(seal,47,186);
        seal.setLocation(72,200);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,266,231);
        label.setLocation(300,357);
        Label label2 = new Label("Use \u2190 and \u2192 to move", 35);
        addObject(label2,94,286);
        label2.setLocation(300,36);
    }
}
