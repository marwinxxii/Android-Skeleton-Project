package com.myapp.core;

import android.os.StrictMode;
import com.myapp.BuildConfig;
import com.myapp.utils.CrashLogger;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashLogger.init(this);

        if (BuildConfig.DEBUG) {
            setStrictMode();
        }
    }

    private static void setStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
          .detectDiskReads()
          .detectDiskWrites()
          .detectNetwork()
          .penaltyLog()
          .build());

        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
          .detectAll()
          .penaltyLog()
          .build());
    }
}
