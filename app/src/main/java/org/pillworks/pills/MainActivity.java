package org.pillworks.pills;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {
private static Button addRx_btn;
private static Button editRx_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
    public void OnClickButtonListener() {
        addRx_btn = (Button)findViewById(R.id.addRx);
        addRx_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("org.pillworks.pills.addNewRx");

                        startActivity(intent);
                    }
                }
        );
        editRx_btn = (Button)findViewById(R.id.editRx);
        editRx_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("org.pillworks.pills.editRx");

                        startActivity(intent);
                    }
                }
        );
    }
}
