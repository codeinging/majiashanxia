package com.mphone.majiashanxia.Main_UI_Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mphone.majiashanxia.R;

/**
 * Created by syd on 2016/4/19.
 */
public class Shop_Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView=inflater.inflate(R.layout.mainui_shop_fragment,container,false);
        return mView;
    }
}
