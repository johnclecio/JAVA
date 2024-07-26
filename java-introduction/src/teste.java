import javax.swing.JFrame;
import javax.swing.JLabel;

public class teste {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("My First JFrame");

        // Create a new JLabel with some text
        JLabel label = new JLabel("Hello, JFrame!");

        // Add the JLabel to the JFrame
        frame.add(label);

        // Set the size of the JFrame
        frame.setSize(300, 200);

        // Set the default close operation of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}