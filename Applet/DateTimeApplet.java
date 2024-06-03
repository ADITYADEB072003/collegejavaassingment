import java.applet.Applet;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeApplet extends Applet implements Runnable {
    private Thread thread;
    private String currentTime;

    @Override
    public void init() {
        currentTime = getCurrentTime();
        // Initialize and start the thread
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paint(Graphics g) {
        // Set the font and color for the text
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.BLACK);
        // Display the current time
        g.drawString(currentTime, 20, 50);
    }

    @Override
    public void run() {
        while (true) {
            // Update the current time
            currentTime = getCurrentTime();
            // Repaint the applet
            repaint();
            try {
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception
                e.printStackTrace();
            }
        }
    }

    private String getCurrentTime() {
        // Format the current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(new Date());
    }

    @Override
    public void stop() {
        // Stop the thread when the applet is stopped
        thread = null;
    }
}
