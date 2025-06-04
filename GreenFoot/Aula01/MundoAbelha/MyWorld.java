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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,212,221);
        Mosca mosca = new Mosca();
        addObject(mosca,514,153);
        aranha.setLocation(46,155);
        Abelha abelha = new Abelha();
        addObject(abelha,269,327);
        mosca.setLocation(466,157);
        mosca.setLocation(453,147);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,372,86);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,80,271);
        mosca2.setLocation(400,99);
        mosca.setLocation(512,216);
        mosca3.setLocation(92,279);
        abelha.setLocation(327,331);
        mosca3.setLocation(383,206);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,512,95);
    }
}
