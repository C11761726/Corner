package com.mile8.corner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("BootBroadcastReceiver", "the program has received BOOT_BROADCAST");
        Toast.makeText(context, "Boot complete!!!", Toast.LENGTH_SHORT).show();
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Intent intent1 = new Intent(context, MyService.class);
            context.startService(intent1);
        }
    }
}
