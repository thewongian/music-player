package com.example.musicplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;

public class MusicCompletionReciever extends BroadcastReceiver {
    MainActivity mainActivity;

    public void MusicCompletionReceiver() {
        //empty constructor
    }

    public void MusicCompletionReceiver(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String musicName = intent.getStringExtra(MusicService.MUSICNAME);
        mainActivity.updateName(musicName);
    }
}
