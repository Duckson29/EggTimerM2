package com.example.eggtimerm2;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.util.Log;

public class ItemTimer implements Runnable {
    private  CountDownTimer timer;
    private int timeStart;
    public int currentTime;

    public ItemTimer(int timeStart) {
        this.timeStart = timeStart;
        this.currentTime = timeStart;
    }

    @Override
    public void run() {
        timer = new CountDownTimer(timeStart,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.println(Log.WARN,"itemTimer",String.valueOf(currentTime));
                currentTime--;
            }


            @Override
            public void onFinish() {
                Log.println(Log.WARN,"itemTimer","Done");
                timeStart = 0;
            }
        };
        if (currentTime != 0){
            timer.start();
        }else{ timer.cancel();}
    }
    public void Debug(){
        Log.w("asd","asdfg");
    }
}
