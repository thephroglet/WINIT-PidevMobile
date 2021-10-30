package tn.esprit.pidevmobile.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import tn.esprit.pidevmobile.dao.UserDAO;
import tn.esprit.pidevmobile.entity.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    private static MyDatabase instance;

    public abstract UserDAO userDAO();

    public static MyDatabase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, "my_db")
                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }
}