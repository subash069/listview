package com.example.subash.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_a=(TextView)findViewById(R.id.textView3);
        tv_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here when the button is clicked
                //open the next page List activity
                Intent intent=new Intent(MainActivity.this,list_activity.class);
                startActivity(intent);
                //
            }
        });

    }
}
