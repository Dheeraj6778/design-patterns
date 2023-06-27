import java.util.ArrayList;
import java.util.List;

public class Authentication {
    private List<User> users;
    private User currentUser;
    public Authentication(){
        this.users=new ArrayList<>();
    }
    public boolean login(String username,String password){
        for(User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("logged in");
                return true;
            }
        }
        System.out.println("user does not exist...sign up");
        return  false;
    }
    public void signUp(String username,String password){
        for(User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("user already exists");
                return;
            }
        }
        User newUser=new User(username,password);
        this.currentUser=newUser;
        users.add(newUser);
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
