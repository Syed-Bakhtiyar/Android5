package com.example.syedinkisarahmed.fifthassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(View v){
        int numberOfCoffees=2;
        submit(numberOfCoffees);
    }
    public void submit(int x){
        TextView tx =(TextView) findViewById(R.id.txt);
        tx.setText(""+x);
        tx= (TextView) findViewById(R.id.txt2);
        tx.setText("$"+(x*5));
    }
}
