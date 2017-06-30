package com.example.wanghaishu.coolweather.util;

/**
 * @创建者 WHS
 * @创建时间 2017/06/29 18:02
 * @描述
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
