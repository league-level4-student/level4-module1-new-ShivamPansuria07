package _05_Polymorphs;
import java.awt.Color;
import java.awt.Graphics;

	public class RedPolymorph extends Polymorph {
	    public RedPolymorph(int x, int y, int width, int height) {
			super(x, y, width, height);
			// TODO Auto-generated constructor stub 
		}
		@Override
		public void update() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void draw(Graphics g) {
			g.setColor(Color.RED);
			g.drawRect(0,0,100,100); 
			
		}

		
	}

