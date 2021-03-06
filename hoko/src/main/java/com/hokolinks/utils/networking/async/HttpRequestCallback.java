package com.hokolinks.utils.networking.async;

import org.json.JSONObject;

/**
 * The callback called when a http request is finished, providing onSuccess and onFailure methods.
 */
public interface HttpRequestCallback {

    void onSuccess(JSONObject jsonObject);

    void onFailure(Exception e);

}
