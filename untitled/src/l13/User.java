package l13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<String> subsriptions = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getSubsriptions() {
        return subsriptions;
    }
    public void subscribe(User user){
        subsriptions.add(user.getUsername());
    }
    public boolean isSubscribed(User user){
        for (String x:subsriptions){
            if (x.equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }
    public boolean isFriend(User user){
        return user.isSubscribed(this) && this.isSubscribed(user);
    }
    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this,user,text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", subsriptions=" + subsriptions +
                '}';
    }
}
