import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application extends JPanel implements ActionListener {
	private int speed = 0;
	Timer timer;
	// create Board
	Board board;

	// create points and balls
	Point A, B, C, D, E, F, G;
	Ball white, red1, red2, red3, red4, red5, red6;

	public Application() {
		setLayout(null);
		
		
		Frame panel_1 = new Frame();
		panel_1.setBounds(10, 5, 420, 238);
//		add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 5, 405, 238);
		add(panel_2);

		// create Board
		board = new Board();

		// create white ball
		A = new Point(100 + speed, 100);
		white = new Ball(A);

		// create 7 red ball
		B = new Point(250, 100);
		C = new Point(265, 108);
		D = new Point(265, 93);
		E = new Point(280, 85);
		F = new Point(280, 100);
		G = new Point(280, 115);
		red1 = new Ball(B);
		red2 = new Ball(C);
		red3 = new Ball(D);
		red4 = new Ball(E);
		red5 = new Ball(F);
		red6 = new Ball(G);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		speed=speed+10;
		
		board.draw(g);
		white.drawWhite(g);
		red1.drawRed(g);
		red2.drawRed(g);
		red3.drawRed(g);
		red4.drawRed(g);
		red5.drawRed(g);
		red6.drawRed(g);

	}

	public void actionPerformed(ActionEvent e) {
			repaint();		
	}

	public static void main(String[] args) {

//			JFrame window = new JFrame();
//			window.setSize(500, 600);
//			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			window.setVisible(true);
//			
//			Application a = new Application();
//			window.getContentPane().add(a);
//
////
//			JPanel panel = new JPanel();
//
//			Application a = new Application();
//			Timer time = new Timer(10,new ActionListener(){
//				
//				public void actionPerformed(ActionEvent arg0) {
//					window.getContentPane().add(panel,BorderLayout.CENTER);
//					window.getContentPane().add(a);
//				}
//				
//			});
//			
//			time.start();
//			JPanel panel = new JPanel();
//			window.getContentPane().add(panel, BorderLayout.CENTER);
//
//			Application Application = new Application();
//			window.getContentPane().add(Application);
//while(true){
//			Application.time.setDelay(10);
//			Application.repaint();
//}
	}
}
