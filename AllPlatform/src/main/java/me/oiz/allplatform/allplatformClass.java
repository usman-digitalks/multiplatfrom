package me.oiz.allplatform;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class allplatformClass {
    public static FirebaseAnalytics mFirebaseAnalytics;

    public static void tagEvent(Context context){

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1234");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "usman");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

    }


}
