package com.example.android.furniture.SampleData;

import com.example.android.furniture.data.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataItem {

    public static List<DataItem> dataItemList;
    public static Map<String, DataItem> dataItemMap;

    static {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new DataItem(null,"Chair", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Kitty", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Table", "Study Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Chair", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Bench", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Dine in Table", "Study Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Tv table", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"NetFlex table", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Amazon table", "Study Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Moving chair", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Old bench", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Used chair", "Study Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Chair", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Kitty", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Table", "Study Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Chair", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Kitty", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Table", "Study Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Chair", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Kitty", "Kitchen Items",
                "chair.jpg", 599));
        addItem(new DataItem(null,"Table", "Study Items",
                "chair.jpg", 599));
    }

    public static void addItem(DataItem item){
        dataItemList.add(item);
        dataItemMap.put(item.getItemId(), item);
    }
}
