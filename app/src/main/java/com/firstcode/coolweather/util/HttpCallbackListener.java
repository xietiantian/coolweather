package com.firstcode.coolweather.util;

/**
 * Created by tiantian on 16-5-30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
