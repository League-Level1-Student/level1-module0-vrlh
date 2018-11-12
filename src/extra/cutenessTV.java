package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	public static void main(String[] args) {
		new cutenessTV().createUI();
	}
	JButton duckButton = new JButton();
	JButton frogButton = new JButton();
	JButton unicornButton = new JButton();
	
	Dimension normal = new Dimension (200, 200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();	
	
	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		
		duckButton.setText("Ducks!");
		frogButton.setText("Frogs!");
		unicornButton.setText("Fluffy Unicorns!");
		
		duckButton.addActionListener(this);
		frogButton.addActionListener(this);
		unicornButton.addActionListener(this);
		
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(unicornButton);
		
		frame.pack();
		frame.setTitle("Matt! It doesn't apply to you!");
		}
	


	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == duckButton) {
			showDucks();
		}
		else if (e.getSource() == frogButton){
			showFrog();
		}
		else if (e.getSource() == unicornButton) {
			showFluffyUnicorns();
		}
	}
}
