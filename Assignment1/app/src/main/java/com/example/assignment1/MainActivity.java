package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b2;
    Button b3;
    Button b1;
    Button b4;
    TextView t1;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.adds);
        t1=findViewById(R.id.text);
        b2=findViewById(R.id.subs);
        b3=findViewById(R.id.resets);
        b4=findViewById(R.id.toast);


        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      a++;
                                      t1.setText(""+a);

                                  }
                              });


         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 a--;
                 t1.setText(""+a);
             }
         });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                t1.setText(""+a);
            }
        });


    }
    public void result(View view){
        Toast.makeText(this,"Your count is:14",Toast.LENGTH_SHORT).show();

    }
}