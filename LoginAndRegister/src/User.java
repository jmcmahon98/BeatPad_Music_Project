
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dylon
 */
public class User {
    
    private int id;
    private String username;
    private String email;
    private String password;
    
    public User(int id,String username, String email, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;   
    }

        public int getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
}
