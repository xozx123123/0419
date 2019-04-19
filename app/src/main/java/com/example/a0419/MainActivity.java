package com.example.a0419;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String txt="";

    public void change(View V){
        int size =18;
        TextView red =findViewById(R.id.textView);
        TextView green =findViewById(R.id.textView2);
        TextView blue =findViewById(R.id.textView3);
        TextView show =findViewById(R.id.textView4);
        Random x =new Random();
        int red1 =x.nextInt(256);
        red.setTextColor(Color.rgb(red1,0,0));
        red.setText("Red:"+red1);
        int green1 = x.nextInt(256);
        green.setTextColor(Color.rgb(0,green1,0));
        green.setText("Green:"+green1);
        int blue1 = x.nextInt(256);
        blue.setTextColor(Color.rgb(0,0,blue1));
        blue.setText("Blue:"+blue1);
        txt +="Red:"+red1+" Green:"+green1+" Blue:"+blue1+"\n";
        show.setTextSize(size);
        show.setText(txt);
        show.setBackgroundColor(Color.rgb(red1,green1,blue1));
        show.setMovementMethod(new ScrollingMovementMethod());

    }
}
