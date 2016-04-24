package com.mphone.majiashanxia;

import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mphone.majiashanxia.Constants.Contants;

/**
 * Created by syd on 2016/4/19.
 */
public class TabOnClickListener implements View.OnClickListener {
    private View titleView;
    private FragmentTabHost fragmentTabHost;
    private int index;
    private View tabItemView;
    private ImageView tabItemImaeView;
    private TextView tabItemTextView;
    private TextView titleTextView;
    public TabOnClickListener(FragmentTabHost mFragmentTabHost, int index) {
        this.fragmentTabHost=mFragmentTabHost;
        this.index=index;
    }
    public TabOnClickListener(FragmentTabHost mFragmentTabHost, int index,View titleView) {
        this(mFragmentTabHost,index);
        this.titleView=titleView;
        if (titleView!=null){
            titleTextView= (TextView) titleView.findViewById(R.id.title_textView);
        }
    }
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        for (int i = 0; i <fragmentTabHost.getTabWidget().getTabCount(); i++) {
            tabItemView=fragmentTabHost.getTabWidget().getChildTabViewAt(i);
            tabItemImaeView= (ImageView) tabItemView.findViewById(R.id.act_main_tab_host_item_imgview);
            tabItemTextView= (TextView) tabItemView.findViewById(R.id.act_main_tab_host_item_textView);
            if (i==index){
                tabItemImaeView.setImageResource(Contants.tabImageSelectedArray[i]);
                if (titleTextView!=null){
                    titleTextView.setText(Contants.tabStringArray[i]);
                }
            }else {
                tabItemImaeView.setImageResource(Contants.tabImageNormalArray[i]);
            }
            /**
             * 由于截取了系统的切换fragment事件
             * 所以这里要自己写切换
             * */
            fragmentTabHost.setCurrentTab(index);
        }
    }
}
