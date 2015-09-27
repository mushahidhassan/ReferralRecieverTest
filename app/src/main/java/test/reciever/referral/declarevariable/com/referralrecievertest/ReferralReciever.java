package test.reciever.referral.declarevariable.com.referralrecievertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by m on 9/18/2015.
 */
public class ReferralReciever extends BroadcastReceiver {
    String referrer;
    @Override
    public void onReceive(Context context, Intent intent) {
        referrer = "";
        Bundle extras = intent.getExtras();
        if (extras != null) {
            referrer = intent.getStringExtra("referrer");
        }
        Log.w("REFERRER", "Referer is: " + referrer);
        Toast.makeText(context, "Referer is: " + referrer, Toast.LENGTH_LONG).show();
    }
}
