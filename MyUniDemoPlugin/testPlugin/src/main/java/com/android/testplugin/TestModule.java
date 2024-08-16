package com.android.testplugin;

import org.json.JSONException;
import org.json.JSONObject;

import io.dcloud.feature.uniapp.annotation.UniJSMethod;
import io.dcloud.feature.uniapp.bridge.UniJSCallback;
import io.dcloud.feature.uniapp.common.UniModule;

public class TestModule extends UniModule {
    @UniJSMethod(uiThread = true)
    public void open(UniJSCallback callback) throws JSONException {
        JSONObject data = new JSONObject();
        data.put("code",94670);
        callback.invoke(data);
    }

    @UniJSMethod(uiThread = true)
    public void backInt(UniJSCallback callback) throws JSONException {
        System.out.println("调用成功");
        JSONObject data = new JSONObject();
        data.put("backInt","congratulations");
        callback.invoke(data);
    }
}
