package org.pillworks.pills;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //what needs to be initialized on app start?
        // Probably gather db entries and create array.
        // InitApp(); //Create DB connection? not sure how this will all work.
        // InitRxData();
    }

    public void AddNewRx(View view){
        setContentView(R.layout.add_new_rx);

    }
}
