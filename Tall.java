import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tall extends Ground
{
    /**
     * Act - do whatever the Tall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tall(int width, int height)        
    {
        getImage().scale(width, height);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("right"))
        {
        move(-1);
        }
        if(Greenfoot.isKeyDown("left"))
        {
        move(1);
        }
    }
}