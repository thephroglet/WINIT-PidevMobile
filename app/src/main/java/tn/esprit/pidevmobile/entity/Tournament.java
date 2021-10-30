package tn.esprit.pidevmobile.entity;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

import java.sql.Timestamp;
import java.util.Date;

public class Tournament {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "Tournament Name")
    private String tournament;
    @ColumnInfo(name = "Team1")
    private String team1;
    @ColumnInfo(name = "Team2")
    private String team2;
    @ColumnInfo(name = "Description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tournament() {
    }

    public Tournament(int id, String tournament, String team1, String team2, String description) {
        this.id = id;
        this.tournament = tournament;
        this.team1 = team1;
        this.team2 = team2;
        this.description = description;
    }

    public Tournament(String tournament, String team1, String team2, String description) {
        this.tournament = tournament;
        this.team1 = team1;
        this.team2 = team2;
        this.description = description;
    }
}
