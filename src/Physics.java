import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Physics implements ActionListener {
	boolean hit;
	double speed;
	double alpha;

	Timer time = new Timer(1000, this);

	public void actionPerformed(ActionEvent e) {
		speed = speed - 10;
		System.out.println(speed);
	}

	public Physics() {
	}

	public Physics(Physics p) {
		p.hit = hit;
		p.speed = speed;
		p.alpha = alpha;
		p.time = time;
	}

	public static void main(String[] args) {
System.out.println("start");
		Physics p = new Physics();
		p.speed = 100;
		p.time.start();
	System.out.println("exit");

	}
}
