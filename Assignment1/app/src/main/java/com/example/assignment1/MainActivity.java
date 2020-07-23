package com.example.assignment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    Button b2;
    Button b3;
    Button b1;
    Button b4;
    TextView t1;
    int a = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.adds);
        t1 = findViewById(R.id.text);
        b2 = findViewById(R.id.subs);
        b3 = findViewById(R.id.resets);
        b4 = findViewById(R.id.toast);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                t1.setText("" + a);

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a--;
                t1.setText("" + a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 0;
                t1.setText("" + a);
            }
        });


        if (savedInstanceState != null) {
            String s = savedInstanceState.getString("rithu");
            a = Integer.parseInt(s);
            t1.setText(s);
        }


    }

    public void result(View view) {
        //String s=t1.getText().toString();
        Toast.makeText(this, "result is " +a, LENGTH_SHORT).show();


    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("rithu",t1.getText().toString());
    }
}


