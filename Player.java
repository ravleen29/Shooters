import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int vSpeed = 0;
    public int gravity = 2;
    public int accel = 0;
    public int speed = 5;
    
    public Player()        
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
    }    
    public void act()
    {
        jump();
        checkFall();
        fall();
        landOnTop();
        moveAround();
        fireProject();
    }
    
    public void fireProject()
    {
        if(Greenfoot.mousePressed(null))
        {
            getWorld().addObject(new Projectile(), getX(), getY());
        }
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
    }
    public void landOnTop()
    {
       if(isTouching(Ground.class))
       {
           setLocation(getX(), getY() - 1);
       }
    }
    
    public void fall()
    {
        setLocation(getX(),getY() + vSpeed);
    }
    
    public void checkFall()
    {
        if(!isTouching(Ground.class))
        {
            vSpeed++;
        }
        else 
        
            vSpeed = 0;
    }
    
    public void jump()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            vSpeed = -8;
        }
        fall();
    }
}
