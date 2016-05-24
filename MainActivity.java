package com.example.synerzip.picassodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/**
 * Libaries used
 * compile 'com.android.support:recyclerview-v7:23.3.0'
    compile 'com.android.support:cardview-v7:23.1.1'
    compile 'com.squareup.picasso:picasso:2.4.0'
    compile 'com.jakewharton:butterknife:8.0.1'
 * 
 * /

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private final String[] android_version_names={
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow"
    };

    private final String[] android_image_urls={
            "http://api.learn2crack.com/android/images/donut.png",
            "http://api.learn2crack.com/android/images/eclair.png",
            "http://api.learn2crack.com/android/images/froyo.png",
            "http://api.learn2crack.com/android/images/ginger.png",
            "http://api.learn2crack.com/android/images/honey.png",
            "http://api.learn2crack.com/android/images/icecream.png",
            "http://api.learn2crack.com/android/images/jellybean.png",
            "http://api.learn2crack.com/android/images/kitkat.png",
            "http://api.learn2crack.com/android/images/lollipop.png",
            "http://api.learn2crack.com/android/images/marshmallow.png"
    };

//    @BindView(R.id.recycler_view)
//    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        //ButterKnife.bind(this);
        initViews();
    }
    private void initViews()
    {

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList android_version=prepareData();
        DataAdapter adapter=new DataAdapter(getApplicationContext(),android_version);
        recyclerView.setAdapter(adapter);
    }
    private ArrayList prepareData(){
        ArrayList versions=new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            AndroidVersion androidVersion=new AndroidVersion();
            androidVersion.setAndroid_verison_name(android_version_names[i]);
            androidVersion.setAandroid_image_url(android_image_urls[i]);
            versions.add(androidVersion);
        }
        return versions;

    }
}
