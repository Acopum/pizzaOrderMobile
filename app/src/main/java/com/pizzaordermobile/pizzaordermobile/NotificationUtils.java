package com.pizzaordermobile.pizzaordermobile;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class NotificationUtils extends ContextWrapper {


    public static final String DEFAULT_CHANNEL_ID = "default";
    private NotificationManagerCompat notificationManagerCompat;

    public NotificationUtils(Context base) {
        super(base);
        notificationManagerCompat = NotificationManagerCompat.from(this);
    }

    public NotificationCompat.Builder buildNotification(String title, String body) {
        return new NotificationCompat.Builder(getApplicationContext(), DEFAULT_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                .setContentTitle(title)
                .setContentText(body)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                ;

    }

    public NotificationManagerCompat getManager() {

        return notificationManagerCompat;
    }

}
