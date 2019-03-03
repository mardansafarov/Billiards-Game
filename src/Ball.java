import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

public class Ball {
	Point p;
	int speed=100;
	double alpha=0.5;
	//ball
	public Ball(){
		p = new Point();
	}
	
	public Ball(Point p){
		this.p=p;
	}
	
	public Ball(Ball b){
		b.p=p;
	}
	
	public void drawWhite(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(p.x, p.y, 15, 15);
	}
	
	public void drawRed(Graphics g){
		Color c = new Color(255,69,0);
		g.setColor(c);
		g.fillOval(p.x, p.y, 15, 15);
	}
	
	public void move(){
		while(speed>0){

			p.x=p.x+speed*(int)Math.cos(alpha);
			p.y=p.y+speed*(int)Math.sin(alpha);
			
			speed = speed - 10;
		}
		
	}
}
