package tn.esprit.pidevmobile.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
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
    @ColumnInfo(name = "available")
    protected Boolean available;


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
    public Team(String s, boolean b) {
        team = s;
        available= b;
    }

    public boolean isAvailable() {
        return available;
    }
    private static int last = 0;
    
    public static ArrayList<Team> createContactsList(int num) {
        ArrayList<Team> team = new ArrayList<Team>();

        for (int i = 1; i <= num; i++) {
            team.add(new Team("Team " + ++last, i <= num / 2));
        }

        return team;
    }

    public Team(String team, String leader, String cin, String phone) {
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
