package views;

import javax.swing.*;

public class AppCalculator extends JFrame {

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnClear;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPoint;
    private JButton btnThree;
    private JButton btnFIve;
    private JButton btnEitgh;
    private JButton btnZero;
    private JButton plus;
    private JButton divide;
    private JButton minus;
    private JButton mutiply;
    private JButton equals;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new AppCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
