import javax.swing.*;
import java.awt.*;

public class JTextFieldExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        // Create a new JPanel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Create a JLabel
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Create a JTextField
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Create a JButton
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 50, 80, 25);
        panel.add(loginButton);
    }
}
 