import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UnclickedButton {
    static int buttonHeight;
    static int buttonWidth;

    public static void main(String[] args) {
        JLabel text= new JLabel();
        JFrame jfm = new JFrame("Press a button");
        jfm.setLayout(new FlowLayout());
        buttonHeight=30;
        buttonWidth=60;
        jfm.setSize(800,600);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton pressIt = new JButton("pressIt");
        pressIt.setBounds(50,100,buttonWidth,buttonHeight);
        pressIt.addActionListener(new ActionListener() {
                                      @Override
                                      public void actionPerformed(ActionEvent actionEvent) {
                                          text.setText("you press it!");
                                      }

                                  }
        );
        pressIt.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                int x =(int) (Math.random()*((jfm.getBounds().width)-buttonWidth));
                int y =(int) (Math.random()*((jfm.getBounds().height)-buttonHeight));
                pressIt.setBounds(x,y,buttonWidth,buttonHeight);
            }
        });
        jfm.add(text);
        jfm.add(pressIt);
        jfm.setVisible(true);

    }
}
