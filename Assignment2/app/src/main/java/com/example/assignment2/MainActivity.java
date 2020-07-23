package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<getString> extends AppCompatActivity {


    TextView tv1,tv2;
    Button r;

    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=findViewById(R.id.reset);
        tv1=findViewById(R.id.text1);
        tv2=findViewById(R.id.text2);


        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=0;
                tv1.setText(""+a);
                tv2.setText(""+b);
            }
        });
        if(savedInstanceState!=null){
            String s=savedInstanceState.getString("rithu");
            String t=savedInstanceState.getString("rr");
            a= Integer.parseInt(s);
            tv1.setText(""+a);
            b= Integer.parseInt(t);
            tv2.setText(""+b);
        }
    }
   @Override
   public void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("rithu",tv1.getText().toString());
        outState.putString("rr",tv2.getText().toString());
   }

    public void add1(View view) {
        a++;
        tv1.setText(""+a);

    }

    public void add11(View view)
    {
        a=a+2;
        tv1.setText(""+a);

    }

    public void add111(View view) {
        a=a+3;
        tv1.setText(""+a);

    }

    public void add2(View view) {
        b++;
        tv2.setText(""+b);

    }

    public void add22(View view) {
        b=b+2;
        tv2.setText(""+b);

    }

    public void add222(View view) {
        b=b+3;
        tv2.setText(""+b);

    }

}