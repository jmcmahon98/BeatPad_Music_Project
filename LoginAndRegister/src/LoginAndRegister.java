import javax.swing.JFrame;

/**
 *
 * @author dylon
 */
public class LoginAndRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // main method called when run application 
        //Instanciates a login screen
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.pack();
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
