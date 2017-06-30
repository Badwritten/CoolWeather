package com.example.wanghaishu.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.wanghaishu.coolweather.service.AutoUpdataService;

/**
 * @创建者 WHS
 * @创建时间 2017/06/30 15:32
 * @描述
 */

public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdataService.class);
        context.startService(i);
    }
}
