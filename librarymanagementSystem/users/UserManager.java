package users;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User searchByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null; // User not found
    }

    public User searchByID(String ID) {
        for (User user : users) {
            if (user.getID().equalsIgnoreCase(ID)) {
                return user;
            }
        }
        return null; // User not found
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
