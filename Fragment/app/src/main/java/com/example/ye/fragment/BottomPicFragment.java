package com.example.ye.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by ye on 16-02-23.
 */
public class BottomPicFragment extends Fragment  {

    private static TextView top_text_view;
    private static TextView bottom_text_view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        top_text_view=(TextView)view.findViewById(R.id.top);
        bottom_text_view=(TextView)view.findViewById(R.id.bottom);
        return view;
    }

    public void setContent(String top,String bottom){
        top_text_view.setText(top);
        bottom_text_view.setText(bottom);
    }
}
