package net.therap.model;

/**
 * Created with IntelliJ IDEA.
 * TeamLeadersInfo: imranahmed
 * Date: 12/10/13
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class TeamLeadersInfo {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "TeamLeadersInfo{" +
                "userName='" + username + '\'' +
                ",password='" + password + '\'' +
                '}';
    }

}
