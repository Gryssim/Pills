package org.pillworks.pills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddNewRx extends AppCompatActivity {
Button button;
EditText mEdit;
    TextView mText;
    String mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_new_rx);
        button = findViewById(R.id.submitNameButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit = (EditText) findViewById(R.id.editText);
                mText = (EditText) findViewById(R.id.testlabel1);
                mytext=mEdit.getText().toString().trim();
                if(mytext.isEmpty())
                {
                    mText.setText(R.string.errorAddRx);
                    mText.setX(5);
                    mText.setTextSize(16);
                    mEdit.setBackgroundColor(0xFFFF0000);
                }
                else
                {
                    mText.setText("Welcome " + mEdit.getText().toString() + "!");
                    mText.setVisibility(View.GONE);
                    mText.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}
