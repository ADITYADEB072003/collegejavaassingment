package users;

public class User {
    private String name;
    private String ID;
    private String role;

    public User(String name, String ID, String role) {
        this.name = name;
        this.ID = ID;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
