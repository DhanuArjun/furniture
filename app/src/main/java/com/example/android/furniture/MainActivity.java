package com.example.android.furniture;

import android.support.constraint.solver.LinearSystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.furniture.SampleData.SampleDataItem;
import com.example.android.furniture.data.DataItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView outPut;
    List<DataItem> dataItemList = SampleDataItem.dataItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });


        /*for(DataItem item : dataItemList){
            outPut.append(item.getItemName() + "\n");
            itemNames.add(item.getItemName());
        }*/


        ItemArrayAdapter adapter = new ItemArrayAdapter(this, dataItemList);
        ListView list = findViewById(R.id.output);

        list.setAdapter(adapter);

    }

}
