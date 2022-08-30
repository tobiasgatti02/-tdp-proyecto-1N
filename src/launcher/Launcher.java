package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student s = new Student(136467, "Tobías", "Gatti", "tobiasgatti02@gmail.com", "https://github.com/tobiasgatti02", "/images/b9d34b92-0697-43a3-bf6e-4c48ce71bd36.jpg");
            	new SimplePresentationScreen(s);
            }
        });
    }
}