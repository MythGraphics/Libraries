package tools;

import java.awt.Font;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalUhr extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;

    private final JLabel label;
    private final Font font = new Font("Verdana", Font.PLAIN, 20);
    private final DateFormat df = new SimpleDateFormat("dd.MM.yyyy G, HH:mm:ss z");
    private Date date;
    private Thread thread;

    public DigitalUhr() {
        label = new JLabel();
        label.setFont(font);
        this.add(label);
        start();
    }

    private void gibDate() {
        label.setText( df.format(date) );
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() {
        while (true) {
            date = new Date();
            gibDate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DigitalUhr c = new DigitalUhr();
        JFrame f = new JFrame();
        f.add(c);
        f.setSize(400, 80);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
