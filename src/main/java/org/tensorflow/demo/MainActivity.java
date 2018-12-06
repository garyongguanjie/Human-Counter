package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText canteenSectionET;
    public static final String MAIN_ACTIVITY_ID = "MAIN_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        canteenSectionET = (EditText) findViewById(R.id.canteenSection);
    }

    public void intentToCounter(View view) {
        Intent intent = new Intent(this,DetectorActivity.class);
        String section = canteenSectionET.getText().toString();
        if(section.equals("")){
            Toast.makeText(this,"Please key in which part of canteen", Toast.LENGTH_SHORT).show();
        } else {
            intent.putExtra(MAIN_ACTIVITY_ID, section);
            startActivity(intent);
        }
    }
}
