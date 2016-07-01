package com.example.mal.popularmovies1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;

import com.squareup.picasso.Picasso;

/**
 * Created by mal on 6/29/2016.
 */
public class MovieAdapter extends ArrayAdapter {
    // references to our images
    private String[] mThumbIds = {};

    private Context mContext;

    public MovieAdapter(Context c){
        super(c, R.layout.activity_main);
    }
    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageButton for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageButton imageButton;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageButton = new ImageButton(mContext);
            imageButton.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageButton.setScaleType(ImageButton.ScaleType.CENTER_CROP);
            imageButton.setPadding(8, 8, 8, 8);
        } else {
            imageButton = (ImageButton) convertView;
        }

        Picasso.with(mContext).load(mThumbIds[position]).into(imageButton);
        return imageButton;
    }

}