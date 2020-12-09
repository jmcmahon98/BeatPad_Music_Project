import java.awt.*;
import javax.swing.*;

public class MyButton extends JButton {
    
    private static final long serialVersionUID = 1L;

    MyButton() {    // Constructor for JButton called MyButton

        this.setVisible(true);  //Changes visibility of MyButton
        this.setPreferredSize(new Dimension(180, 180)); // Sets Preffered size of MyButton within JFrame Layout
        this.setFocusable(false); // Removes highlight box around button text
        this.setBackground(Color.white); // Sets background colour
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2)); // Adds border to edge of button
        this.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); // Changes font, text style and text size of text on button
        this.setForeground(Color.red); // Changes text colour of button text
    }
}
