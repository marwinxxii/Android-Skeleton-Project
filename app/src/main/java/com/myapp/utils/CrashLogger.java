package com.myapp.utils;

import android.content.Context;
import com.myapp.BuildConfig;

import static com.myapp.utils.LogHelper.LOGE;
import static com.myapp.utils.LogHelper.makeLogTag;

public abstract class CrashLogger {
    private static final String TAG = makeLogTag(CrashLogger.class);

    public static void init(Context context) {
        if (BuildConfig.REPORT_CRASHES) {
            //crash logger initialization
        }
    }

    public static void logException(Throwable error) {
        if (BuildConfig.REPORT_CRASHES) {
            //log exception
        } else {
            LOGE(TAG, "log exception", error);
        }
    }
}
