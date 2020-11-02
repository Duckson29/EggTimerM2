package com.example.eggtimerm2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.eggtimerm2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

       public ItemTimer timer = new ItemTimer(1000000);
       public EggModel selectedEgg = new EggModel(10,"BlødKogt");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

     ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.setTimerClock(timer);
        activityMainBinding.setEggselected(selectedEgg);

//        Handler handler = new Handler();
//        handler.post(timer);
//
//        Button startBtn = findViewById(R.id.StartBtn);
//        startBtn.setOnClickListener(v -> {
//            if(!v.isEnabled() && selectedEgg != null)
//                v.setEnabled(true);
//            else
//                v.setEnabled(false);
//        });
    }
//    public void onButtonEggSelectedClicked(View view) {
//        switch (view.getId()){
//            case R.id.SoftEggBtn:
//                selectedEgg = new EggModel(10,"Blødkogt Æg");
//                timer = new ItemTimer(selectedEgg.getTime_To_Cook_In_Milisecs());
//                timer.run();
//                textTimer.setText(selectedEgg.getTime_To_Cook_In_Milisecs());
//            case R.id.HardEggBtn:
//                selectedEgg = new EggModel(10,"Hårdt kogt Æg");
//                timer = new ItemTimer(selectedEgg.getTime_To_Cook_In_Milisecs());
//                timer.run();
//            case R.id.MedEggBtn:
//                selectedEgg = new EggModel(10,"Smiling Æg");
//                timer = new ItemTimer(selectedEgg.getTime_To_Cook_In_Milisecs());
//                timer.run();
//        }
//    }

}