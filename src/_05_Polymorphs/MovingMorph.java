package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
    public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub 
	}
	@Override
	public void update() {
		System.out.println("This will not be printed");
		if(x< 390){
			x+=10;
		}
		
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(x,y,100,100); 
		
	}

	
}

