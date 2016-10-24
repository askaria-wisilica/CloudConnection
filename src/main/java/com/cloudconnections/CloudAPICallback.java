package com.cloudconnections;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Albi on 15-10-2016.
 */
public interface CloudAPICallback {

    public void onSuccess(JSONObject jsonObject);

    public void onSuccess(JSONArray jsonArray);

    public void onFailure(int errorCode, String errorMessage);
}
