package com.ideamanufactuer.rekoning;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SplashActivity extends ActionBarActivity {
    private static final int SPLASH_INTERVAL = 3000;// in milliseconds.
    Boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


 class WAitForSplash extends AsyncTask<Void,Void,Void>{

     @Override
     protected Void doInBackground(Void... params) {
         for (int i = 0; i < SPLASH_INTERVAL; i += 50)
             try {
                 if (isActive)
                     Thread.sleep(50);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         return null;

     }
     @Override
     protected void onPostExecute(Void aVoid) {
         super.onPostExecute(aVoid);
         Navigate.toMainActivity(SplashActivity.this);

     }
 }
}
