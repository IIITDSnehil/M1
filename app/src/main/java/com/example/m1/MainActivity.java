package com.example.m1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String MyTag ="Myactivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MyTag,"In on Create");
    }


        public void sendMessage(View view){
            //d for log in debug mode
            Log.d( "MYCODE", "IT WORKS");
            Intent newIntent = new Intent(this,Main2Activity.class);
             startActivity(newIntent);
        }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MyTag,"In on Start");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MyTag,"In on Resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MyTag,"In on Pause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MyTag,"In on Stop");
    }
    @Override
    protected void onDestroy() {
        Log.d(MyTag,"In on Destroy");
        super.onDestroy();
    }
}
