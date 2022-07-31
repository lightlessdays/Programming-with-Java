import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

class AWT {
    AWT(String s) {
        Frame frame = new Frame("Question 9");
        Label l = new Label(s);
        l.setBounds(25, 50, 250, 30);
        l.setAlignment(Label.CENTER);
        frame.setBackground(Color.pink);
        frame.setSize(300, 400);
        frame.add(l);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to display: ");
        String s=input.next();
        new AWT(s);
    }
    
}
