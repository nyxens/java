package w4_4.library.users;
public class User{
    private String name;
    private String userID;
    public User(String name,String userID){
        this.name = name;
        this.userID = userID;
    }
    public String getName(){
        return name;
    }
    public String getUserID(){
        return userID;
    }
    public String getDetails(){
        return "User Name: " + name + ", User ID: " + userID;
    }
}