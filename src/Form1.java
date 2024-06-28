import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    public JPanel menuPanel;
    private JPasswordField contratxt;
    private JButton aceptarButton;
    private JTextField nombretxt;

    public Form1() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("x");
            }
        });
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contratxt.getText().equals("12345") && nombretxt.getText().equals("Alejandro")) {
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setTitle("Panel 3");
                    frame.setContentPane(new Form3().menu3);
                    frame.setSize(600, 300);
                    frame.setPreferredSize(new Dimension(600, 300));
                    frame.setMinimumSize(new Dimension(600, 300));
                    frame.pack();
                    frame.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(aceptarButton)).dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        });
    }
}
