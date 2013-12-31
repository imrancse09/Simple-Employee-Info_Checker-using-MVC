package net.therap.model;

/**
 * Created with IntelliJ IDEA.
 * TeamLeadersInfo: imranahmed
 * Date: 12/12/13
 * Time: 9:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeInfo {
    private String eName;
    private String workLocation;
    private String teamLeader;
    private String date;


    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getTeamLeader() {
        return this.teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "eName='" + eName + '\'' +
                ",workLocation='" + workLocation + '\'' +
                ", teamLeader='" + teamLeader + '\'' +
                '}';
    }
}
