package swingTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class RandomRect extends JComponent{

	private static final long serialVersionUID = 1L;
	
	public RandomRect(int x, int y, Color color) {
		super();
		this.setPreferredSize(new Dimension(x, y));
		this.setBackground(color);

	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}
}
