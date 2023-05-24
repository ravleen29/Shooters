import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int vSpeed = 0;
    private int gravity = 2;
    private int accel = 0;
    private int speed = 2;
    
    boolean canFire = true;
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
        onground();
        landOnTop();
        moveAround();
        fireProjectile();
    }
    
    public void fireProjectile()    
    {
        if (Greenfoot.isKeyDown("space") && canFire == true)
        {
            getWorld().addObject(new Projectile(), getX()-30, getY());
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
           move(1);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
    }
    public void landOnTop()
    {
       if(isTouching(Ground.class))
       {
           setLocation(getX(), getY() - 1);
       }
    }
    boolean onground()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2,Tall.class);
        return under != null;
    }
    
    public void fall()
    {
        setLocation(getX(),getY() + vSpeed);
        vSpeed = vSpeed + accel;
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
            vSpeed = -3;
        }
        fall();
    }
    
}
