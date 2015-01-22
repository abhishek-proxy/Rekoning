package com.ideamanufactuer.rekoning;

import android.content.Context;
import android.content.Intent;

/**
 * Created by linux on 20/1/15.
 */
public class Navigate {

    public static void toMainActivity(Context context) {

        Intent intent = new Intent(context,HomeScreenActivity.class);
        context.startActivity(intent);
    }
}
