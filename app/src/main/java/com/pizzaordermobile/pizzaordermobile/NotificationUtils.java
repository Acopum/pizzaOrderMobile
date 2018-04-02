package com.pizzaordermobile.pizzaordermobile;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class NotificationUtils extends ContextWrapper {


    public static final String DEFAULT_CHANNEL_ID = "default";
    public static final String DEFAULT_CHANNEL_NAME = "Default";
    public static final String DEFAULT_CHANNEL_DESCRIPTION = "Default Channel Description.";
    private NotificationManager notificationManager;

    public NotificationUtils(Context base) {
        super(base);
        notificationManager = (NotificationManager)base.getSystemService(Context.NOTIFICATION_SERVICE);

        initChannels(this);

    }

    private void initChannels(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Create the NotificationChannel, but only on API 26+ because
            // the NotificationChannel class is new and not in the support library
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL_ID, DEFAULT_CHANNEL_NAME, importance);
            notificationChannel.setDescription(DEFAULT_CHANNEL_DESCRIPTION);
            // Register the channel with the system
            notificationManager.createNotificationChannel(notificationChannel);
        }

    }

    public boolean buildNotification(String title, String body) {
        // build notification
        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(this, DEFAULT_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                .setContentTitle(title)
                .setContentText(body)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                ;

        // display notification
        notificationManager.notify(69, nBuilder.build());

        return true;

    }


}
