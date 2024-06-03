import java.applet.Applet;
import java.awt.Graphics;
//DC2022BCA0004
public class PersonalDetailsApplet extends Applet {
    // Initialize the applet
    public void init() {
        // You can initialize any necessary components here
    }

    // Paint method to draw the content
    public void paint(Graphics g) {
        // Set the starting coordinates
        int x = 20;
        int y = 20;

        // Draw each line of text
        g.drawString("Name: John Doe", x, y);
        y += 20;  // Move to the next line
        g.drawString("Roll Number: 123456", x, y);
        y += 20;  // Move to the next line
        g.drawString("Course: Computer Science", x, y);
        y += 20;  // Move to the next line
        g.drawString("Year: 2024", x, y);
        y += 20;  // Move to the next line
        g.drawString("College: XYZ University", x, y);
    }
}
