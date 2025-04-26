
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrames extends JFrame {
    myFrames(){       
       //The appearance of your Frame
       //setSize (x, y) axis
       this.setSize(450, 520); // sets the x and y dimension of the this
       this.setTitle("My First GUI"); // Sets the title of your this
       this.setVisible(true); // make this visible
       this.setResizable(false); // make your this unresizable argument: true or false
       
       // When the X button is hit
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When the X button is hit the whole program will close and not hide
       //this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Only hide the application
       //this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // The X has no functionality
       
       
       //LOGO ICON on top of your Frame
       ImageIcon image = new ImageIcon("bg.jpg"); // in your argument insert the path and name of your image
       this.setIconImage(image.getImage()); // set your image to change the default logo of your this
       
       //change the color of your background in your thiss
//       this.getContentPane().setBackground(Color.red); // default set
//       this.getContentPane().setBackground(new Color(123,50,250)); // RGB
       this.getContentPane().setBackground(new Color(0xeee)); // Hexadecimal
    }
}
