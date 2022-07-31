import java.awt.*;
import java.awt.event.*;

class KbdAdapter extends KeyAdapter {
    Label l;

    KbdAdapter(Label l) {
        this.l = l;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Typed character is: " + e.getKeyChar());
    }

}

public class Main extends Frame {
    Label l;

    Main() {
        super("AWT Keyboard");
        l = new Label("");
        l.setBounds(25, 50, 250, 30);
        l.setAlignment(Label.CENTER);
        this.addKeyListener(new KbdAdapter(l));
        this.add(l);
        this.setSize(300, 110);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
