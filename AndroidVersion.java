package com.example.synerzip.picassodemo;

/**
 * Created by synerzip on 24/5/16.
 * compile 'com.android.support:recyclerview-v7:23.3.0'
    compile 'com.android.support:cardview-v7:23.1.1'
    compile 'com.squareup.picasso:picasso:2.4.0'
    compile 'com.jakewharton:butterknife:8.0.1'
 */
public class AndroidVersion {
    public String getAndroid_verison_name() {
        return android_verison_name;
    }

    public void setAndroid_verison_name(String android_verison_name) {
        this.android_verison_name = android_verison_name;
    }

    public String getAandroid_image_url() {
        return aandroid_image_url;
    }

    public void setAandroid_image_url(String aandroid_image_url) {
        this.aandroid_image_url = aandroid_image_url;
    }

    private String android_verison_name;
    private String aandroid_image_url;
}
