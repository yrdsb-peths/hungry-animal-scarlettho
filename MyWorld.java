import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Seal seal = new Seal();
        addObject(seal, 300, 200);
        
        Apple apple = new Apple();
        addObject(apple, 300, 0);
    }
}
