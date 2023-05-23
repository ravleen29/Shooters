import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -3;
    public Enemy()        
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }    
    public void act()
    {
        moveAround();
    }
    public void moveOnTop()
    {
       if(isTouching(Ground.class))
       {
           setLocation(getX(), getY() - 1);
       }
    }
    public void moveAround()
    {
        
        setLocation(getX() + speed, getY());
        if(getY() == 0) {
            speed = 0;
        } 
   
    }
}
