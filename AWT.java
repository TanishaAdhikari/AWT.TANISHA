package awt.java.com;

import java.awt.*;
import java.awt.event.*;

public class AWT {

    // Constructor to set up the AWT components
    public AWT() {

        // Create a new Frame with title "NAMASTE"
        Frame frame = new Frame("NAMASTE");

        // Create a Label and a TextField for name
        Label label = new Label("Timro Naam");
        label.setBounds(50, 50, 70, 30);
        TextField txtfield = new TextField();
        txtfield.setBounds(150, 50, 200, 30);

        // Create a Label and a TextField for age
        Label label2 = new Label("Kati barsa ko vayeu:");
        label2.setBounds(50, 100, 150, 30);
        TextField txtfield2 = new TextField();
        txtfield2.setBounds(200, 100, 200, 30);

        // Create a Button for submitting the form
        Button button = new Button("Submit");
        button.setBounds(150, 150, 80, 30);

        // ActionListener for the Submit Button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Output the entered information to the console
                System.out.println("Timro Naam: " + txtfield.getText());
                System.out.println("Kati barsa ko vayeu: " + txtfield2.getText());
            }
        });

        // Add all components to the frame
        frame.add(label);
        frame.add(txtfield);
        frame.add(label2);
        frame.add(txtfield2);
        frame.add(button);

        // Set layout to null to use absolute positioning
        frame.setLayout(null);

        // Set the size of the frame and make it visible
        frame.setSize(450, 250);
        frame.setVisible(true);
    }

    // Main method to run the program
    public static void main(String[] args) {
        new AWT();  // Create an instance of AWTclass to display the GUI
    }
}




