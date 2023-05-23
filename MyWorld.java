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
        super(3000, 700, 1, false); 
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
        Wide wide3 = new Wide();
        addObject(wide3,1827,659);
        wide3.setLocation(1518,673);
        wide3.setLocation(1516,664);
        Wide wide4 = new Wide();
        addObject(wide4,2493,634);
        Tall tall = new Tall(160, 150);
        addObject(tall,2960,579);
        tall.setLocation(2934,634);
        Tall tall2 = new Tall(200, 70);
        addObject(tall2,658,353);
        Tall tall3 = new Tall(200, 70);
        addObject(tall3,967,313);
        tall3.setLocation(954,436);
        tall2.setLocation(711,310);
        Tall tall4 = new Tall(200, 70);
        addObject(tall4,1440,298);
        Tall tall5 = new Tall(200, 70);
        addObject(tall5,1961,384);
        Tall tall6 = new Tall(300, 50);
        addObject(tall6,1106,174);
        Tall tall7 = new Tall(300, 50);
        addObject(tall7,2320,143);
        Tall tall8 = new Tall(50, 50);
        addObject(tall8,810,30);
        Tall tall9 = new Tall(50, 50);
        addObject(tall9,1278,70);
        Tall tall10 = new Tall(50, 50);
        addObject(tall10,1646,112);
        Tall tall11 = new Tall(50, 50);
        addObject(tall11,1882,76);
        Tall tall12 = new Tall(50, 40);
        addObject(tall12,1721,349);
        Tall tall13 = new Tall(40, 40);
        addObject(tall13,1308,461);
        tall13.setLocation(1253,451);
        Tall tall14 = new Tall(50, 40);
        addObject(tall14,2500,366);
        Tall tall15 = new Tall(50, 40);
        addObject(tall15,2181,288);
        Tall tall16 = new Tall(50, 30);
        addObject(tall16,2740,248);
        tall16.setLocation(2710,247);
    }
}
