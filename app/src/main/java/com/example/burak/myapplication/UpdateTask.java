package com.example.burak.myapplication;

import android.content.Context;
import android.os.AsyncTask;


/**
 * Created by burak on 5.4.2018.
 */

public class UpdateTask extends AsyncTask<Void, Void, Void> {
    private Context mCon;
    private android.widget.Toast Toast;

    public UpdateTask(Context con)
    {
        mCon = con;
    }

    @Override
    protected Void doInBackground(Void... nope) {
        try {
            // Set a time to simulate a long update process.
            Thread.sleep(4000);

            return null;

        } catch (Exception e) {
            return null;
        }
    }

    @Override
    protected void onPostExecute(Void nope) {
        // Give some feedback on the UI.
        Toast.makeText(mCon, "Hava durumu güncellendi",
                Toast.LENGTH_LONG).show();

        // Change the menu back
        ((MainActivity) mCon).resetUpdating();
    }
}
