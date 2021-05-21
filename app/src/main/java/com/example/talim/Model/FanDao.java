package com.example.talim.Model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FanDao {
    @Query("SELECT * FROM fanlar")
    List<FanData> getAll();

    @Insert
    void insertFanlar(FanData fanData);

}
