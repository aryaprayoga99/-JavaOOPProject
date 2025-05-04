package project;

import project.model.Admin;
import project.service.UserService;

public class MainApp {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.addUser(new Admin("admin1", "admin1@example.com"));
        service.addUser(new Admin("admin2", "admin2@example.com"));
        
        service.showAllUsers();
    }
}
