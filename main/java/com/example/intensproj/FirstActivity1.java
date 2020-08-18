package com.example.intensproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FirstActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);

        public void onClick(View )
        {
            openSecondActivity2();
        }
    }

    private void openSecondActivity2() {
    }


    public void onClickBtn(View v)
    {
        Context context = getApplicationContext();
        CharSequence message = "Sending message";
        int duration = Toast.LENGTH_SHORT;


        Toast toast = Toast.makeText(this, "Sending message", Toast.LENGTH_LONG);
         toast.show();
    }
}