package tn.esprit.pidevmobile.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import tn.esprit.pidevmobile.entity.User;

@Dao
public interface UserDAO {

    @Insert
    void insertOne(User user);

    @Delete
    void delete(User user);

    @Query("SELECT * FROM user")
    List<User> getAll();
}
