import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    // A JFrame opens a window from the console that can be customised
    
    MyButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but10, but11, but12, but13, but14, but15, but16,
            but17, but18; // Creates MyButtons
    JPanel topPanel, centerPanel; // Creats JPanels
    JLabel label; // Creates JLabel

    MyFrame() {

        topPanel = new JPanel(); // Creates a new instance of JPanel
        topPanel.setBackground(Color.yellow); // Sets color for JPanel
        topPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 1, 2, Color.black));
        topPanel.setVisible(true); // Sets whether or not JPanel is visible

        centerPanel = new JPanel(); // Creates a new instance of JPanel
        centerPanel.setBackground(Color.cyan); // Sets color for JPanel
        centerPanel.setBorder(BorderFactory.createMatteBorder(1, 2, 2, 2, Color.black));
        centerPanel.setVisible(true); // Sets whether or not JPanel is visible

        label = new JLabel(); // Creates a new instance of JLabel
        label.setText("BeatPad"); // Sets text inside JLabel
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 60)); // Defines font, text style and text size of label
        label.setForeground(Color.blue); // Sets text color of JLabel
        label.setVisible(true); // Defines visibility of JLabel

        but1 = new MyButton();// Creates a new instance of MyButton
        but1.setText("BUTTON 1");// Sets the text inside the button
        but1.addActionListener(this);// Add action listener for button press

        but2 = new MyButton();// Creates a new instance of MyButton
        but2.setText("BUTTON 2");// Sets the text inside the button
        but2.addActionListener(this);// Add action listener for button press

        but3 = new MyButton();// Creates a new instance of MyButton
        but3.setText("BUTTON 3");// Sets the text inside the button
        but3.addActionListener(this);// Add action listener for button press

        but4 = new MyButton();// Creates a new instance of MyButton
        but4.setText("BUTTON 4");// Sets the text inside the button
        but4.addActionListener(this);// Add action listener for button press

        but5 = new MyButton();// Creates a new instance of MyButton
        but5.setText("BUTTON 5");// Sets the text inside the button
        but5.addActionListener(this);// Add action listener for button press

        but6 = new MyButton();// Creates a new instance of MyButton
        but6.setText("BUTTON 6");// Sets the text inside the button
        but6.addActionListener(this);// Add action listener for button press

        but7 = new MyButton();// Creates a new instance of MyButton
        but7.setText("BUTTON 7");// Sets the text inside the button
        but7.addActionListener(this);// Add action listener for button press

        but8 = new MyButton();// Creates a new instance of MyButton
        but8.setText("BUTTON 8");// Sets the text inside the button
        but8.addActionListener(this);// Add action listener for button press

        but9 = new MyButton();// Creates a new instance of MyButton
        but9.setText("BUTTON 9");// Sets the text inside the button
        but9.addActionListener(this);// Add action listener for button press

        but10 = new MyButton();// Creates a new instance of MyButton
        but10.setText("BUTTON 10");// Sets the text inside the button
        but10.addActionListener(this);// Add action listener for button press

        but11 = new MyButton();// Creates a new instance of MyButton
        but11.setText("BUTTON 11");// Sets the text inside the button
        but11.addActionListener(this);// Add action listener for button press

        but12 = new MyButton();// Creates a new instance of MyButton
        but12.setText("BUTTON 12");// Sets the text inside the button
        but12.addActionListener(this);// Add action listener for button press

        but13 = new MyButton();// Creates a new instance of MyButton
        but13.setText("BUTTON 13");// Sets the text inside the button
        but13.addActionListener(this);// Add action listener for button press

        but14 = new MyButton();// Creates a new instance of MyButton
        but14.setText("BUTTON 14");// Sets the text inside the button
        but14.addActionListener(this);// Add action listener for button press

        but15 = new MyButton();// Creates a new instance of MyButton
        but15.setText("BUTTON 15");// Sets the text inside the button
        but15.addActionListener(this);// Add action listener for button press

        but16 = new MyButton();// Creates a new instance of MyButton
        but16.setText("BUTTON 16");// Sets the text inside the button
        but16.addActionListener(this);// Add action listener for button press

        but17 = new MyButton();// Creates a new instance of MyButton
        but17.setText("BUTTON 17");// Sets the text inside the button
        but17.addActionListener(this);// Add action listener for button press

        but18 = new MyButton();// Creates a new instance of MyButton
        but18.setText("BUTTON 18");// Sets the text inside the button
        but18.addActionListener(this);// Add action listener for button press

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes application on exit
        this.setLayout(new BorderLayout()); // Changes frame layout to a border layout
        this.setSize(1200, 700); // Sets size (x-coordinate, y-coordinate)

        ImageIcon frameImage = new ImageIcon("ireland.png"); // Creates ImageIcon
        this.setIconImage(frameImage.getImage()); // Sets frame image to ImageIcon

        this.add(topPanel, BorderLayout.NORTH); // Adds JPanel to JFrame in set location
        this.add(centerPanel, BorderLayout.CENTER); // Adds JPanel to JFrame in set location

        topPanel.add(label); // Adds JLabel to JPanel

        centerPanel.add(but1); // Places MyButton within JPanel
        centerPanel.add(but2); // Places MyButton within JPanel
        centerPanel.add(but3); // Places MyButton within JPanel
        centerPanel.add(but4); // Places MyButton within JPanel
        centerPanel.add(but5); // Places MyButton within JPanel
        centerPanel.add(but6); // Places MyButton within JPanel
        centerPanel.add(but7); // Places MyButton within JPanel
        centerPanel.add(but8); // Places MyButton within JPanel
        centerPanel.add(but9); // Places MyButton within JPanel
        centerPanel.add(but10); // Places MyButton within JPanel
        centerPanel.add(but11); // Places MyButton within JPanel
        centerPanel.add(but12); // Places MyButton within JPanel
        centerPanel.add(but13); // Places MyButton within JPanel
        centerPanel.add(but14); // Places MyButton within JPanel
        centerPanel.add(but15); // Places MyButton within JPanel
        centerPanel.add(but16); // Places MyButton within JPanel
        centerPanel.add(but17); // Places MyButton within JPanel
        centerPanel.add(but18); // Places MyButton within JPanel

        this.setVisible(true); // Changes visibility, must be called after all components added
    }

    /*
     * Action Listener code that knows whether a button is pressed and delivers
     * output
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but1) {
            System.out.println("Output 1");
            but1.setEnabled(false);
            but1.setBackground(Color.lightGray);
        } else if (e.getSource() == but2) {
            String audioFilePath = "Beatpad/Clap-1.wav";
            playClap player = new playClap();
            player.play(audioFilePath);
        } else if (e.getSource() == but3) {
            System.out.println("Output 3");
        } else if (e.getSource() == but4) {
            System.out.println("Output 4");
        } else if (e.getSource() == but5) {
            System.out.println("Output 5");
        } else if (e.getSource() == but6) {
            System.out.println("Output 6");
        } else if (e.getSource() == but7) {
            System.out.println("Output 7");
        } else if (e.getSource() == but8) {
            System.out.println("Output 8");
        } else if (e.getSource() == but9) {
            System.out.println("Output 9");
        } else if (e.getSource() == but10) {
            System.out.println("Output 10");
        } else if (e.getSource() == but11) {
            System.out.println("Output 11");
        } else if (e.getSource() == but12) {
            System.out.println("Output 12");
        } else if (e.getSource() == but13) {
            System.out.println("Output 13");
        } else if (e.getSource() == but14) {
            System.out.println("Output 14");
        } else if (e.getSource() == but15) {
            System.out.println("Output 15");
        } else if (e.getSource() == but16) {
            System.out.println("Output 16");
        } else if (e.getSource() == but17) {
            System.out.println("Output 17");
        } else if (e.getSource() == but18) {
            System.out.println("Output 18");
        }
    }
}
