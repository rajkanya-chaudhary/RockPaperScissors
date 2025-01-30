import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class DigitalWatch {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Watch");
        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Timer timer = new Timer(1000, e -> {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            label.setText(time);
        });
        timer.start();
    }
}
