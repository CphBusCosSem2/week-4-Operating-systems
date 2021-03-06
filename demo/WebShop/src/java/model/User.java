package model;

public class User {
    private String username;
    private String password;
    private double balance;
    private boolean isAdmin;
    
    public User(String username, String password, double balance, boolean isAdmin){
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.isAdmin = isAdmin;
    }
    
    public User(){ }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    
    public boolean isAdmin() { return this.isAdmin; }
    public void setAdmin(boolean isAdmin) { this.isAdmin = isAdmin; }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + '}';
    }
}
