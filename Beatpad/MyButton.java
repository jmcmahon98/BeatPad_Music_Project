import java.awt.*;
import javax.swing.*;
// import java.awt.event.*; 

public class MyButton extends JButton {
    
    private static final long serialVersionUID = 1L;

    MyButton() {

        this.setVisible(true);
        this.setPreferredSize(new Dimension(180, 180));
        this.setFocusable(false);
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createEtchedBorder());
        // ImageIcon butImage1 = new ImageIcon("right-arrow.png"); // Creates ImageIcon
        // but1.setIcon(butImage1);
        // but1.setHorizontalTextPosition(JButton.CENTER);
        // but1.setVerticalTextPosition(JButton.CENTER);
        this.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        this.setIconTextGap(40);
        this.setForeground(Color.red);

    }
}
