

/*
<applet code="BlinkEye" width=500 height=500></applet>
*/

import java.applet.*;
import java.awt.*;

public class BlinkEye extends Applet implements Runnable {
	
	Thread t;
	boolean s = false;
	
	public void start() {
		t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g) {
		if(s) {
			
			g.setColor(Color.BLACK);
			g.drawOval(100,100,100,100);
			
			g.setColor(Color.BLACK);
			g.fillOval(120,125,20,20);
			
			g.setColor(Color.BLACK);
			g.fillOval(160,125,20,20);
			
			g.setColor(Color.BLACK);
			g.drawLine(150,165,150,150);
			
			g.setColor(Color.RED);
			g.fillArc(130, 150, 40, 40, 180, 180);
			
		}
		else {
			g.setColor(Color.BLACK);
			g.drawOval(100,100,100,100);
			
			g.drawArc(120, 125, 20, 20, 180, 180);
			
			g.drawArc(160, 125, 20, 20, 180, 180);
			
			g.setColor(Color.BLACK);
			g.drawLine(150, 165, 150, 150);
			
			g.setColor(Color.RED);
			g.drawLine(130, 170, 170, 170);
		}
	}
	public void run() {
		try {
			
			for( ; ; ) {
				
				if(s == false)
					s = true;
				else
					s = false;
				
				Thread.sleep(500);
				
				repaint();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
