import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;          
    /**
     
    */
    public Counter()                
    {
        setImage(new GreenfootImage("Score: " + score, 70, Color.WHITE, Color.BLACK));
    }
    
    public void act()              
    {
        setImage(new GreenfootImage("Score: " + score, 25, Color.WHITE, Color.BLACK));
        YouWin();
    }
    
    public void addScore()        
    {
        score++;
    }
    public void YouWin()          
    {
        if (score >= 5)
        {
            getWorld().addObject(new YouWin(), 450, 300);
            Greenfoot.stop();
            
        }
    }
}
