package com.example.talim.Model;

import androidx.room.ColumnInfo;

public class YangilikData {
    private String fan_nomi;
    private String uqituvchi_ismi;
    private Integer imageUrl;

    public YangilikData(String fan_nomi, String uqituvchi_ismi, Integer imageUrl) {
        this.fan_nomi = fan_nomi;
        this.uqituvchi_ismi = uqituvchi_ismi;
        this.imageUrl = imageUrl;
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
