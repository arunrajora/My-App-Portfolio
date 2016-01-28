package com.arun.rajora.portfolio.app.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String []app_name = {
                "Spotify Streamer",
                "Super Duo: Football Scores App",
                "Super Duo: Library App",
                "Build it Bigger",
                "XYZ Reader",
                "Capstone"
        };
        List<String> app_name_list=new ArrayList<String>(Arrays.asList(app_name));
        ArrayAdapter<String> app_name_adapter=new ArrayAdapter<String>(
                this,
                R.layout.my_app_list_items,
                R.id.app_list_button,
                app_name_list
        );
        ListView listview=(ListView)findViewById(R.id.list_of_my_apps);
        listview.setAdapter(app_name_adapter);
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
    public void app_name_clicked(View view)
    {
        Context context=getApplicationContext();
        Button btn=(Button)view;
        CharSequence text="This button will launch "+btn.getText()+" app !";
        Toast toast= Toast.makeText(context,text,Toast.LENGTH_SHORT);
        toast.show();
    }
}
