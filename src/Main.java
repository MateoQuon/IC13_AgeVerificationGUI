import javax.swing.*;

public class Main extends JPanel {
    public static void main(String[] args) {
        // Every dialogue (ask user for input) is provided by the JOptionPane class
        int response = -1;
        while (response == -1) {
            response = JOptionPane.showConfirmDialog(null, "Are you 21 years of age or older? ",
                    "Age Verification", JOptionPane.YES_NO_OPTION);
            switch (response) {
                case JOptionPane.YES_OPTION:
                    JOptionPane.showMessageDialog(null, "Proceed on, adult!", "You are an Adult", JOptionPane.OK_OPTION);
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null, "You shall not pass!",
                            "Minor Detected", JOptionPane.OK_OPTION);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    JOptionPane.showMessageDialog(null, "You must answer the question.",
                            "Aversion Detected", JOptionPane.OK_OPTION);

           }
        }
    }
}
