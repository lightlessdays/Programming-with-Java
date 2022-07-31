import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {
    Button btnInfo, btnCGPA;

    Main() {
        super("Student Details");
        btnInfo = new Button("A");
        btnInfo.setBounds(25, 125, 450, 100);
        btnInfo.addActionListener(this);
        this.add(btnInfo);
        btnCGPA = new Button("B");
        btnCGPA.setBounds(25, 300, 450, 100);
        btnCGPA.addActionListener(this);
        this.add(btnCGPA);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInfo) {
            new Information(
                    "DHRUV BADAYA",
                    "BSc (Hons) Computer Science",
                    "20211411",
                    "Ramanujan College");
        } else if (e.getSource() == btnCGPA) {
            new CGPA("8.34");
        }
    }
}