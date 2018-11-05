/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the Internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String URL = "https://o.aolcdn.com/images/dims?quality=100&image_uri=http%3A%2F%2Fo.aolcdn.com%2Fhss%2Fstorage%2Fmidas%2F4cda7898b101295e5336a2806b3c799e%2F206295606%2Fjpeg-xs.jpg&client=amp-blogside-v2&signature=b9c43513fe0e4037091809535f3fd91037d9b59b";
		// 2. create a variable of type "Component" that will hold your image
		Component component;
		// 3. use the "createImage()" method below to initialize your Component
		component = createImage(URL);

		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog(null, "Who is in the picture?");
		// 7. print "CORRECT" if the user gave the right answer
		int score = 0;
		if (answer.equals("Trump")) {
			System.out.println("CORRECT");
			score++;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line of code)
		String Img = "https://pbs.twimg.com/profile_images/482185538493890560/vDVARZZu_400x400.jpeg";
		Component hi;
		hi = createImage(Img);
		// 11. add the second image to the quiz window
		quizWindow.add(hi);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String ans = JOptionPane.showInputDialog(null, "What social media platform is this from?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (ans.equals("twimg")) {
			System.out.println("Correct");
			score++;
		} else {
			System.out.println("Correct");
		}
		System.out.println(score);

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
