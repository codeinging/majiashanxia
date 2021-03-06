package com.mphone.majiashanxia.View.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import com.mphone.majiashanxia.Constants.Contants;
import com.mphone.majiashanxia.R;
import com.mphone.majiashanxia.TabOnClickListener;

import static com.mphone.majiashanxia.Utils.universialImageLoader.initImageLoader;

public class MainActivity extends AppCompatActivity {
//    /**
//     * 用注解代替find
//     * */
//    @InjectView(R.id.act_main_tab_host)
//    private FragmentTabHost mFragmentTabHost;
//    /**此处必须加空格*/
    private LayoutInflater mLayoutInflater;
    private FragmentTabHost mFragmentTabHost;
    private View titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageLoader(getApplicationContext());
        initView();
    }
    private void initView() {
        titleView=findViewById(R.id.main_titleView);
        mFragmentTabHost= (FragmentTabHost) findViewById(R.id.act_main_tab_host);
        mLayoutInflater=LayoutInflater.from(this);
        mFragmentTabHost.setup(this,getSupportFragmentManager(),
                R.id.action_main_layout_content);
        int count= Contants.tabStringArray.length;
        TabHost.TabSpec mTabSpec;
        for (int i = 0; i <count; i++) {
            if (i==0){
                //生成一个tab标签，默认第一个被选中
                mTabSpec=mFragmentTabHost.newTabSpec(String.valueOf(Contants.tabStringArray[i]))
                        .setIndicator(getTabItemView(Contants.tabImageSelectedArray[i],Contants.tabStringArray[i]));
            }else {
                mTabSpec=mFragmentTabHost.newTabSpec(String.valueOf(Contants.tabStringArray[i])).
                        setIndicator(getTabItemView(Contants.tabImageNormalArray[i],Contants.tabStringArray[i]));
            }
            /**
             * 给每一个tab标签添加fragment
             * */
            mFragmentTabHost.addTab(mTabSpec,Contants.tabFragmentArray[i],null);
            /**
             * 底部点击改变颜色
             * */
            mFragmentTabHost.getTabWidget().getChildTabViewAt(i).setOnClickListener(new TabOnClickListener(mFragmentTabHost,i,titleView));
            mFragmentTabHost.getTabWidget().setGravity(Gravity.CENTER_HORIZONTAL);
            /**去掉分割线*/
            mFragmentTabHost.getTabWidget().setDividerDrawable(null);
        }
    }
    /**
     * 设置每个Tab的上面的文字和图片
     */
    public View getTabItemView(int imageResId, int stringResId){
        View layoutInflater;
        View view = mLayoutInflater.inflate(R.layout.main_foot_tab_item,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.act_main_tab_host_item_imgview);
        TextView text = (TextView)view.findViewById(R.id.act_main_tab_host_item_textView);
        imageView.setImageResource(imageResId);
        text.setText(stringResId);
        return view;
    }
}
