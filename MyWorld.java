import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1000, 700, 1, false); 
        getBackground().setColor(new Color(135,206,235));
        getBackground().fill();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,96,375);
        player.setLocation(46,493);
        Wide wide = new Wide();
        addObject(wide, 0, 666);
        Wide wide2 = new Wide();
        addObject(wide2,500,666);
        wide2.setLocation(642,665);

        player.setLocation(40,576);
        player.setLocation(63,486);
        player.setLocation(60,513);
        player.setLocation(48,554);
        player.setLocation(76,570);
        Projectile projectile = new Projectile();
        addObject(projectile,76,570);
        player.setLocation(79,570);
        player.setLocation(76,566);
        player.setLocation(54,554);
        wide2.setLocation(696,666);
    }
}
