package swingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class App {

	 private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("9/11");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create the menu bar.  Make it have a green background.
	        JMenuBar greenMenuBar = new JMenuBar();
	        greenMenuBar.setOpaque(true);
	        greenMenuBar.setBackground(new Color(154, 165, 127));
	        greenMenuBar.setPreferredSize(new Dimension(200, 50));
	        
	        JTextField user = new JTextField("Logged in: 	George W. Bush");
	        greenMenuBar.add(user);
	        JTextField options = new JTextField("Your options: ");
	        options.setHorizontalAlignment(JTextField.RIGHT);
	        greenMenuBar.add(options);
	        
	        JButton button1 = new JButton();
	        button1.setText("Do something");
	        greenMenuBar.add(button1);
	        
	        JButton button2 = new JButton();
	        button2.setText("Chill in a random kindergarten");
	        greenMenuBar.add(button2);
	        
	        
	        //Create a yellow label to put in the content pane.
	        JLabel yellowLabel = new JLabel();
	        yellowLabel.setOpaque(true);
	        yellowLabel.setBackground(new Color(248, 213, 131));
	        yellowLabel.setPreferredSize(new Dimension(200, 180));

	        //Set the menu bar and add the label to the content pane.
	        frame.setJMenuBar(greenMenuBar);
	        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
	        
	        JPanel panel = new JPanel();
	        panel.setSize(new Dimension(400,400));
	        panel.setBorder(new LineBorder(Color.BLACK));
	        panel.setLayout(new BorderLayout());
//	        panel.setLayout(new GridLayout(1, 10, 10, 10));
	        
	        JPanel nestedCenter = new JPanel();
	        nestedCenter.setSize(new Dimension(200, 400));
	        nestedCenter.setLayout(new BorderLayout());
	       
	        BufferedImage image = null;
	        try {
	        	image = ImageIO.read(new File("Flag_of_Jihad.png")); 
	        } catch (IOException e) {
	        	e.printStackTrace();
	        }
	        JLabel picLabel = new JLabel(new ImageIcon(image));
	        picLabel.setBounds(0, 0, 100, 20);
	        nestedCenter.add(picLabel, BorderLayout.PAGE_END);
	        
	        //text section
	        
	        JTextField opponentText = new JTextField("OPPONENT FOUND!");
	        opponentText.setBackground(panel.getBackground());
	        opponentText.setHorizontalAlignment(JTextField.CENTER);
	        
	 
	        RandomRect wtc1 = new RandomRect(100,400, Color.GRAY); 
	        RandomRect wtc2 = new RandomRect(100,400, Color.GRAY);
	        RandomRect bottom = new RandomRect(300, 50, panel.getBackground());
	        
	        panel.add(wtc1, BorderLayout.EAST);
	        panel.add(nestedCenter, BorderLayout.CENTER);
	        panel.add(wtc2, BorderLayout.WEST);
	        panel.add(opponentText, BorderLayout.PAGE_START);
	        panel.add(bottom, BorderLayout.PAGE_END);
	        
	        //Display the window.
	        frame.setContentPane(panel);
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}
