package unirio.edd.project.monitoria.dao;

import unirio.edd.project.monitoria.object.User;

public class UserDAO {
    public boolean checkLogin(User user) {
        return user.getUsername().equals("admin")
                && user.getPassword().equals("nimda");
    }
    
   
}