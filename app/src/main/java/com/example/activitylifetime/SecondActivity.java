package com.example.activitylifetime;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "---------");
        Log.d(LOG_TAG, "onCreate");
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        // gets extra
        String textoRecibido = intent.getStringExtra("nombreUsuario");
        // displays it in the textlayout
        TextView textView = findViewById(R.id.layoutNombreUsuario);
        textView.append(textoRecibido);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onDestroy");
    }
    public void returnReply(View view){
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }
}
