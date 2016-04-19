package com.mphone.majiashanxia.customOnclicklistener;

import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mphone.majiashanxia.Constants.Contants;
import com.mphone.majiashanxia.R;

/**
 * Created by syd on 2016/4/19.
 */
public class TabOnClickListener implements View.OnClickListener {
    private FragmentTabHost fragmentTabHost;
    private int index;
    private View tabItemView;
    private ImageView tabItemImaeView;
    private TextView tabItemTextView;
    public TabOnClickListener(FragmentTabHost mFragmentTabHost, int index) {
        this.fragmentTabHost=mFragmentTabHost;
        this.index=index;
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
                //tabItemTextView.setTextColor(Color.BLUE);
            }else {
                tabItemImaeView.setImageResource(Contants.tabImageNormalArray[i]);
                //tabItemTextView.setTextColor(Color.BLACK);
            }
            /**
             * 由于截取了系统的切换fragment事件
             * 所以这里要自己写切换
             * */
            fragmentTabHost.setCurrentTab(index);
        }
    }
}
