package com.cloudconnections.utility;

import android.util.Log;

/**
 * Created by Albi on 20-10-2016.
 */
public class Logger {

    public  static boolean IS_DEBUG_ENABLED = true;

    public static void i(String TAG, String msg) {
        if (IS_DEBUG_ENABLED)
            Log.i(TAG, msg);
    }

    public static void v(String TAG, String msg) {
        if (IS_DEBUG_ENABLED)
            Log.v(TAG, msg);
    }

    public static void w(String TAG, String msg) {
        if (IS_DEBUG_ENABLED)
            Log.w(TAG, msg);
    }

    public static void d(String TAG, String msg) {
        if (IS_DEBUG_ENABLED)
            Log.d(TAG, msg);
    }

    public static void e(String TAG, String msg) {
        if (IS_DEBUG_ENABLED)
            Log.e(TAG, msg);
    }

}
