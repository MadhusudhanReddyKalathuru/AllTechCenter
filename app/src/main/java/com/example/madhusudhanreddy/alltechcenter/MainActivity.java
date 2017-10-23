package com.example.madhusudhanreddy.alltechcenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Madhusudhan Reddy on 12/13/2016.
 */

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

        b1 = (Button)findViewById(R.id.d1);
        b2 = (Button)findViewById(R.id.d2);
        b3 =(Button)findViewById(R.id.d3);
        b4 =(Button)findViewById(R.id.d4);
        b5 =(Button)findViewById(R.id.d5);
        b6 =(Button)findViewById(R.id.d6);
        b7 =(Button)findViewById(R.id.d7);
        b8 =(Button)findViewById(R.id.d8);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,Java2Novice.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,JavaTPoint.class);
                startActivity(intent);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,TutorialsPoint.class);
                startActivity(intent);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,W3Schools.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MkYong.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CoderHub.class);
                startActivity(intent);
            }
        });


    }
}
