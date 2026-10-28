package com.example.lab3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MotionDetailActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_detail);
        TextView tvDetails = findViewById(R.id.tvDetails);
        String time = getIntent().getStringExtra("time");
        if (time != null){
            tvDetails.setText("The phone was moved at:\n" + time);
        } else{
            tvDetails.setText("No motion info found.");
        }
    }
}
