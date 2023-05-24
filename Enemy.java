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
    int speed = -1;
    int count = 0;
    public Enemy()        
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }    
    public void act()
    {
        count++;
        moveAround();
        hitByProjectile();
        removeEnemy();
    }
    
    public void moveAround()
    {
        if(count<60)
        {
            move(-1);
            setLocation(getX() + speed, getY());
        }
        else{
            speed = -speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
    }
    
    public void hitByProjectile()      
    {
         Actor projectile =  getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            getWorld().removeObject(this);
        } 
           
        else if(getY() == 599)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            getWorld().removeObject(this);
        }
    }
    public void removeEnemy()
    {
        
    }
}
