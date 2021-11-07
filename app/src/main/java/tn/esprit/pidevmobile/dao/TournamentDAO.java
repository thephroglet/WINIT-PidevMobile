package tn.esprit.pidevmobile.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import tn.esprit.pidevmobile.entity.Tournament;

@Dao
public interface TournamentDAO {

    @Insert
    void insertOne(Tournament tour);

    @Delete
    void delete(Tournament tour);

    @Query("SELECT * FROM tournament")
    List<Tournament> getAll();
}
