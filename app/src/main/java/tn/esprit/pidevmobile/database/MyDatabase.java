package tn.esprit.pidevmobile.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import tn.esprit.pidevmobile.dao.TeamDAO;
import tn.esprit.pidevmobile.dao.TournamentDAO;
import tn.esprit.pidevmobile.dao.UserDAO;
import tn.esprit.pidevmobile.entity.Team;
import tn.esprit.pidevmobile.entity.Tournament;
import tn.esprit.pidevmobile.entity.User;
import tn.esprit.pidevmobile.entity.Team;
import tn.esprit.pidevmobile.entity.Tournament;

@Database(entities = {User.class, Tournament.class, Team.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    private static MyDatabase instance;

    public abstract UserDAO userDAO();
    public abstract TeamDAO teamDAO();
    public abstract TournamentDAO tournamentDAO();


    public static MyDatabase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, "mydatabase")
                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }

}
