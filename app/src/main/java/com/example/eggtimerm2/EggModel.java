package com.example.eggtimerm2;

public class EggModel {
    private int time_To_Cook_In_Milisecs;
    private String name_On_Type_Off_Egg;


    public String getName_On_Type_Off_Egg() {
        return name_On_Type_Off_Egg;
    }
    public void setName_On_Type_Off_Egg(String name_On_Type_Off_Egg) {
        this.name_On_Type_Off_Egg = name_On_Type_Off_Egg;
    }
    public int getTime_To_Cook_In_Milisecs() {
        return time_To_Cook_In_Milisecs;
    }
    public void setTime_To_Cook_In_Milisecs(int time_To_Cook_In_Milisecs) {
        this.time_To_Cook_In_Milisecs = time_To_Cook_In_Milisecs;
    }
    public EggModel(int _time_To_Done,String _egg_Type){
        setName_On_Type_Off_Egg(_egg_Type);
        setTime_To_Cook_In_Milisecs(_time_To_Done);
    }
}
