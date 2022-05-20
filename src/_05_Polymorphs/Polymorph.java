package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    protected int width;
    protected int height; 
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}


	
