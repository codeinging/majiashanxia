package com.mphone.majiashanxia.Utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by syd on 2016/4/24.
 */
public class ToastUtils {
    private static Toast mToast=null;
    /**
     * @param context
     * @param message
     * */
    public static void showMessage(Context context,String message){
        if (mToast==null){
            mToast=Toast.makeText(context,message,Toast.LENGTH_SHORT);
        }else {
            mToast.setText(message);
        }
        mToast.show();
    }
    /**
     * @param context
     * */
    public static void showNetWorkError(Context context){
        showMessage(context,"网络连接错误!");
    }
}
