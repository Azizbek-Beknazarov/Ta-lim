package com.example.talim.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "fanlar")
public class FanData {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    @ColumnInfo(name = "fan_nomi")
    private String fan_nomi;

    @ColumnInfo(name = "uqituvchi_ismi")
    private String uqituvchi_ismi;

    @ColumnInfo(name = "imageUrl")
    private Integer imageUrl;

    public FanData(String fan_nomi, String uqituvchi_ismi, Integer imageUrl) {
        this.fan_nomi = fan_nomi;
        this.uqituvchi_ismi = uqituvchi_ismi;
        this.imageUrl = imageUrl;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFan_nomi() {
        return fan_nomi;
    }

    public void setFan_nomi(String fan_nomi) {
        this.fan_nomi = fan_nomi;
    }

    public String getUqituvchi_ismi() {
        return uqituvchi_ismi;
    }

    public void setUqituvchi_ismi(String uqituvchi_ismi) {
        this.uqituvchi_ismi = uqituvchi_ismi;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
