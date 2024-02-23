import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HOSTING");
        frame.setContentPane(new hosting().hostingp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}