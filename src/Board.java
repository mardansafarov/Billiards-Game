import java.awt.Color;
import java.awt.Graphics;

public class Board {
	
	public Board(){	
	}
	
	public Board(Board b){
	}
	public void draw(Graphics g){
		Color brown = new Color(139,69,19);
		g.setColor(brown);
		g.fillRect(10, 10, 400, 200);
		Color darkgreen = new Color(34,139,34);
		g.setColor(darkgreen);
		g.fillRect(22, 22,376, 176);
		g.setColor(Color.BLACK);
		g.drawRect(10, 10,400, 200);
		g.fillOval(10, 10, 25, 25);
		g.fillOval(385, 10, 25, 25);
		g.fillOval(385, 185, 25, 25);
		g.fillOval(10, 185, 25, 25);
		g.fillOval(197, 10, 25, 25);
		g.fillOval(197, 185, 25, 25);
		g.drawRect(22, 22,376, 176);
	}
	

}
