package com.example.android.furniture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.furniture.data.DataItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.zip.Inflater;

public class ItemArrayAdapter extends ArrayAdapter {

    //import list
    List<DataItem> mDataItemList = new ArrayList<>();
    LayoutInflater mInflater;

    public ItemArrayAdapter(@NonNull Context context, @NonNull List objects) {
        super(context,  R.layout.list_item, objects);

        mDataItemList = objects;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_item, parent, false);

        }

        TextView textView =  convertView.findViewById(R.id.item_name);
        ImageView imageView = convertView.findViewById(R.id.image_view);

        DataItem item = mDataItemList.get(position);

        textView.setText(item.getItemName());
        imageView.setImageResource(R.drawable.apple_pie);


        return convertView;
    }
}
