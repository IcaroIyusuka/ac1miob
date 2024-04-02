package com.example.ac1mob;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button bciane, bcs, bigua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bciane = (Button) findViewById(R.id.bciane);
        bcs = (Button) findViewById(R.id.bcs);
        bigua = (Button) findViewById(R.id.bigua);

        bciane.setOnApplyWindowInsetsListener(v ->{
            Intent intent = new
                    Intent(MainActivity.this, MainCiane.class);
            startActivity(intent);
        });
    }
}