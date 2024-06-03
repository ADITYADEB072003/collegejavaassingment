//DC2022BCA0004
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerApplet extends Applet implements ActionListener {
    private Button changeColorButton;
    private Color currentColor;

    @Override
    public void init() {
        // Initialize the button
        changeColorButton = new Button("Change Background Color");
        changeColorButton.addActionListener(this);
        
        // Add the button to the applet
        add(changeColorButton);
        
        // Set the initial color
        currentColor = Color.WHITE;
    }

    @Override
    public void paint(Graphics g) {
        // Set the background color
        setBackground(currentColor);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Change the background color when the button is pressed
        if (e.getSource() == changeColorButton) {
            // Generate a random color
            currentColor = new Color(
                (int)(Math.random() * 0x1000000)
            );
            
            // Repaint the applet to reflect the new color
            repaint();
        }
    }
}
