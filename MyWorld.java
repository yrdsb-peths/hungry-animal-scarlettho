import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This game has our hero, the Seal, to eat as much food that is falling from the sky.
 * If the food is not caught in time, the game ends.
 * 
 * @author Scarlett Ho
 * @version September 23, 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Create the Seal object
        Seal seal = new Seal();
        addObject(seal, 300, 200);
        
        //Create a label
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 30, 35);
        
        createApple();
        createStrawberry();
    }
    
    /**
     * Increase the score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    public void increaseScore2()
    {
        score += 3;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * Creating a new apple in a different space each time.
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    public void createStrawberry()
    {
        Strawberry strawberry = new Strawberry();
        strawberry.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(strawberry, x, y);
    }
    
    /**
     * End the game and have a 'Game Over' label.
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
