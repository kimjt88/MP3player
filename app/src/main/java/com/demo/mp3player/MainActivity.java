package com.demo.mp3player;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_start,bt_stop;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_start = (Button) findViewById(R.id.bt_start);
        bt_stop = (Button) findViewById(R.id.bt_stop);

        bt_start.setOnClickListener(this);
        bt_stop.setOnClickListener(this);
        // 해당 인텐트는 음악만 인텐트한다.
        intent = new Intent(this,MusicService.class);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt_start :
                startService(intent);
                break;
            case R.id.bt_stop:

                break;
        }

    }
}
