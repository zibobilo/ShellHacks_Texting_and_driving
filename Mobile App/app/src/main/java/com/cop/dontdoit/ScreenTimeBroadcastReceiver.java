package com.cop.dontdoit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScreenTimeBroadcastReceiver extends BroadcastReceiver {

    private long startTimer;
    private long endTimer;
    private long screenOnTimeSingle;
    private long screenOnTime;
    private final long TIME_ERROR = 1000;

    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            startTimer = System.currentTimeMillis();
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            endTimer = System.currentTimeMillis();
            screenOnTimeSingle = endTimer - startTimer;

            if (screenOnTimeSingle < TIME_ERROR) {
                Constants.screenOnTime += screenOnTime;
            }

        }
    }
}