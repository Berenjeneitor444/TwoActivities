package com.example.activitylifetime;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "---------");
        Log.d("MainActivity", "onCreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity", "--------");
        Log.d("MainActivity", "onStart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "--------");
        Log.d("MainActivity", "onPause");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("MainActivity", "--------");
        Log.d("MainActivity", "onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity", "--------");
        Log.d("MainActivity", "onResume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity", "--------");
        Log.d("MainActivity", "onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity", "--------");
        Log.d("MainActivity", "onDestroy");
    }
    public void toSecondActivity(View view){
        // gets the inputTextBox object reference
        EditText cajaInput = findViewById(R.id.nombreUsuario);
        // gets the string of the input text box
        String nombreUsuario = cajaInput.getText().toString();
        // sends extra
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nombreUsuario", nombreUsuario);
        startActivity(intent);
    }
}
