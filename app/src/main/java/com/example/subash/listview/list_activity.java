package com.example.subash.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by subash on 6/12/16.
 */
public class list_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        //data source:what should be published in the listview
        //adaper:to populate the data in list view
        //data source as array
        String[] names = {"Ajay", "Ram", "Hari", "Hari", "Hari", "Hari", "Hari", "Hari", "Hari"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        ListView lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);

    }
}