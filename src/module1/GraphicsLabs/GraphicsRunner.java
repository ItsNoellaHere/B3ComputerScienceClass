package module1.GraphicsLabs;

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame {
	
	private static final long serialVersionUID = -4448677044864620437L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner() {
		super("Graphics Runner");

		setSize(WIDTH, HEIGHT);

		getContentPane().add(new SmileyFace());

		// add other classes to run them
		// BigHouse, Robot, or ShapePanel

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		GraphicsRunner run = new GraphicsRunner();
	}
}