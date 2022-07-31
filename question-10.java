import java.awt.*;
import java.awt.event.*;

class AWTo implements ActionListener{
    Frame frame=new Frame();
    Button red=new Button();
    Button blue=new Button();
    AWTo() {        
        red.setBackground(Color.red);
        blue.setBackground(Color.blue);
        blue.setBounds(25,200,250,30);
        red.setBounds(25, 100, 250, 30);
        red.setLabel("RED");
        blue.setLabel("BLUE");
        red.setForeground(Color.white);
        blue.setForeground(Color.white);
        frame.add(blue);
        frame.add(red);
        red.addActionListener(this);
        blue.addActionListener(this);
        frame.setLayout(null);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            frame.dispose();
            }
                
        });
        
    }  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red) frame.setBackground(Color.red);
        else if(e.getSource()==blue) frame.setBackground(Color.blue);
        }

    }

public class Main {
    public static void main(String[] args) {
        new AWTo();
    }
    
}
