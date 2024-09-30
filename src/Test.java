import javax.swing.*;

public class Test extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new Test().Kodlama);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel Kodlama;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
