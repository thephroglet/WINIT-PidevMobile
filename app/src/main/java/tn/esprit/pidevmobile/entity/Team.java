package tn.esprit.pidevmobile.entity;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class Team {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "Team Name")
    private String team;
    @ColumnInfo(name = "Team Leader")
    private String leader;
    @ColumnInfo(name = "CIN")
    private String cin;
    @ColumnInfo(name = "phone")
    private String phone;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Team() {
    }

    public Team(String team, String leader, String cin, String phone) {
        this.team = team;
        this.leader = leader;
        this.cin = cin;
        this.phone = phone;
    }

    public Team(int id, String team, String leader, String cin, String phone) {
        this.id = id;
        this.team = team;
        this.leader = leader;
        this.cin = cin;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", Team Name='" + team + '\'' +
                ", Team Leader='" + leader + '\'' +
                ", CIN='" + cin + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
