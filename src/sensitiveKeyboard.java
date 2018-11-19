import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.KeyPair;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class sensitiveKeyboard implements KeyListener{
	
	public static void main(String[] args) {
		new sensitiveKeyboard().createUI();
		
			
		
		
		
		
	}	
	JFrame frame = new JFrame();
	
	
	
	private void createUI() {
	frame.addKeyListener(this);
	frame.setVisible(true);
	
	
	}
	
		
	
	 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		speak("ouch");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }
	}

