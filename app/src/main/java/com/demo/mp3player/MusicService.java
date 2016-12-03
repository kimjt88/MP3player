package com.demo.mp3player;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by 1027 on 2016-12-03.
 */

public class MusicService extends Service {
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        Log.i("서비스 테스트", "onCreate()");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        Log.i("서비스 테스트", "onDestroy()");
        mp.stop();
        super.onDestroy();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO Auto-generated method stub
       Log.i("서비스 테스트", "onStartCommand()");
        mp= MediaPlayer.create(this, R.raw.song1);
        mp.setLooping(true);
        mp.start();
        return super.onStartCommand(intent, flags, startId);
    }


}
