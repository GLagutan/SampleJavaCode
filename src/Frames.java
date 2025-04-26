

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class Frames {
  
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Declare the JFrame using Object
        frame.setSize(450, 520); // Set the Frame Size
        frame.setTitle("My First GUI"); // Set the Title of your Frame
        frame.setVisible(true); // Set the Visibility of your Frame
        frame.setResizable(true); // Set your Frame if resizable or not
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the function when the user trigger the close button
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Only hide the application when the close button is triggered
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // The close button has no functionality

        ImageIcon image = new ImageIcon("goat.png"); // Call the image of the icon for the Frame
        frame.setIconImage(image.getImage()); // Set the image as an Icon
//        frame.getContentPane().setBackground(Color.red); // Set the Frame content as Red Background
//        frame.getContentPane().setBackground(new Color(0,255, 255)); // Set the Frame's Background Color in RGB Format
        frame.getContentPane().setBackground(new Color(0xeee)); // Set the Frame's Background Color in Hexadecimal Format     
    }
}


//// Frames - this needs an import javax.swing.JFrame;
//        JFrame frame = new JFrame();// creates a frame
//        //The appearance of your Frame
//        //setSize (x, y) axis
//        frame.setSize(450, 520); // sets the x and y dimension of the frame
//        frame.setTitle("My First GUI"); // Sets the title of your frame
//        frame.setVisible(true); // make frame visible
//        frame.setResizable(false); // make your frame unresizable argument: true or false
//        // When the X button is hit
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When the X button is hit the whole program will close and not hide
//        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Only hide the application
//        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // The X has no functionality
//        //LOGO ICON on top of your Frame
//        ImageIcon image = new ImageIcon("bg.jpg"); // in your argument insert the path and name of your image
//        frame.setIconImage(image.getImage()); // set your image to change the default logo of your frame
//        //change the color of your background in your frames
//        //       frame.getContentPane().setBackground(Color.red); // default set
//        //       frame.getContentPane().setBackground(new Color(123,50,250)); // RGB
//        frame.getContentPane().setBackground(new Color(0xeee)); // Hexadecimal