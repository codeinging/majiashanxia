package com.mphone.majiashanxia.Constants;

import android.app.Fragment;

import com.mphone.majiashanxia.Main_UI_Fragment.Discory_Fragment;
import com.mphone.majiashanxia.Main_UI_Fragment.Message_Fragment;
import com.mphone.majiashanxia.Main_UI_Fragment.Mine_Fragment;
import com.mphone.majiashanxia.Main_UI_Fragment.Shop_Fragment;
import com.mphone.majiashanxia.Main_UI_Fragment.Tool_Fragment;
import com.mphone.majiashanxia.R;

/**
 * Created by syd on 2016/4/19.
 */
public class Contants {
    //fragment数组
    public Fragment[] fragments;
    //frahment类名数组
    public static Class[]tabFragmentArray={Discory_Fragment.class,
            Shop_Fragment.class, Tool_Fragment.class,
            Message_Fragment.class, Mine_Fragment.class};
    //底部标题栏文字数组
    public static int[] tabStringArray={R.string.discover,
            R.string.shop,R.string.tool,R.string.message,
            R.string.mine};
    //默认情况下底部标题栏的图标数组
    public static int[]tabImageNormalArray={R.drawable.search_book_normal,
            R.drawable.order_seat_normal,R.drawable.mine_normal,
            R.drawable.search_book_normal,R.drawable.mine_normal};
    //底部标题栏选中图标数组
    public static int[]tabImageSelectedArray={R.drawable.search_book_press,
            R.drawable.order_seat_press,R.drawable.mine_press,
            R.drawable.search_book_press,R.drawable.mine_press};
    /*====================================*/
}
