package com.nguyenthanhthai.googlemappet.googlemap;

import android.app.Application;
import com.android.volley.RequestQueue;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class CustomApplication extends Application{
    private RequestQueue requestQueue;
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = VolleySingleton.getInstance(getApplicationContext()).getRequestQueue();
    }
    public RequestQueue getVolleyRequestQueue(){
        return requestQueue;
    }
}
