package tn.esprit.pidevmobile.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Tournament {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "Tournament Name")
    private String tournament;
    @ColumnInfo(name = "Team1")
    private String team1;
    @ColumnInfo(name = "Team2")
    private String team2;
    @ColumnInfo(name = "Bet")
    private float bet;
    @ColumnInfo(name = "Date")
    private String date;
    @ColumnInfo(name = "Time")
    private String time;

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

    public float getBet() {
        return bet;
    }

    public void setBet(float bet) {
        this.bet = bet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Tournament() {
    }


}
