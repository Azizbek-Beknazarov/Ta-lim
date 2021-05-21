package com.example.talim.Model;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {FanData.class},version = 1,exportSchema = false)
public abstract class FanDB extends RoomDatabase {
    private static final String DB_NAME = "fanlarDB";
    private static FanDB instance;

    public static synchronized FanDB getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), FanDB.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract FanDao fanlarDao();
}
