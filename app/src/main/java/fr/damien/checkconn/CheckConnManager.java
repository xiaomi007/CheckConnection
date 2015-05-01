package fr.damien.checkconn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;

/**
 * Created by damien on 2015/05/01 <damien.pradat@tamecco.com>
 */
public class CheckConnManager extends BroadcastReceiver {

    private static final String TAG = CheckConnManager.class.getSimpleName();

    public static final String PREFS_NAME = "connection";
    public static final String PREFS_CONN_BOOL = "connected";

    public CheckConnManager() {
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            Log.d(TAG, "Connectivity changed");
        }
    }

}
