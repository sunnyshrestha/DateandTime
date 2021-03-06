package dev.suncha.datetime;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    ListView lv;
    Context context;
    ArrayList settingsList;

    public static int[] settingsImages={R.drawable.ic_event_grey600_48dp,R.drawable.ic_access_time_grey600_48dp};
    public static String[] settingsTitle={"Change Date","Change Time"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        lv=(ListView)findViewById(R.id.listview);
        lv.setAdapter(new CustomAdapter(this,settingsTitle,settingsImages));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
