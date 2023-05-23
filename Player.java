import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public Player()        
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }
    int vSpeed = 0;
    int accel = 0;
    public void act()
    {
        fall();
        checkFalling();
    }
    public void fall()
    {
        setLocation(getX(),getY() + vSpeed);
    }
    public void checkFalling()
    {
        if(!isTouching(Ground.class))
        {
            vSpeed++;
        }
        else 
        {
            vSpeed = 0;
        }
    }
}
