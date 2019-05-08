package com.ilus9.myapp.service;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "FCM Service";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // TODO: Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated.
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        Log.d(TAG, "Notification Message Id: " + remoteMessage.getMessageId());
        Log.d(TAG, "Notification Message SubmitBy: " + remoteMessage.getFrom());
        Log.d(TAG, "Notification Message Title: " + notification.getTitle());
        Log.d(TAG, "Notification Message Body: " + notification.getBody());
        Log.d(TAG, "Notification Message Group: " + remoteMessage.getCollapseKey());
        Log.d(TAG, "Notification Message Data: ");
        for (Map.Entry<String, String> entry : remoteMessage.getData().entrySet()) {
            Log.d(TAG, entry.getKey() + " = " + entry.getValue());
        }

    }


}
