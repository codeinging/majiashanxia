package com.mphone.majiashanxia.Presentor;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mphone.majiashanxia.R;

/**
 * Created by syd on 2016/4/23.
 */
public class TitleBar extends RelativeLayout {
    private static final String TAG ="TitleBar";
    private Context mContext;
    //中间大标题
    private TextView titleTextView;
    //标题文字
    private String titleText;
    //标题文字颜色
    private int titleTextColor;
    //标题栏背景
    private int backGroundColor;
    //左边、右边按钮
    private ImageButton leftButton,rightButton;
    //左右按钮图标
    private Drawable  leftDrawble,rightDrawble;
    private Float titleTextSize;
    public TitleBar(Context context) {
        super(context);
        this.mContext=context;
        initView();
    }
    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext=context;
        getAttrs(attrs);
        initView();
    }
    public TitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        getAttrs(attrs);
        initView();
    }
    private void getAttrs(AttributeSet attrs) {
        //获取xml属性
        TypedArray mTypedArray=mContext.obtainStyledAttributes(attrs, R.styleable.TitleBar);
        titleText=mTypedArray.getString(R.styleable.TitleBar_titleText);
        backGroundColor = mTypedArray.getColor(R.styleable.TitleBar_bacground,0);
        leftDrawble=mTypedArray.getDrawable(R.styleable.TitleBar_leftButtonDrawble);
        rightDrawble=mTypedArray.getDrawable(R.styleable.TitleBar_rightButtonDrawble);
        titleTextSize=mTypedArray.getDimension(R.styleable.TitleBar_titleTextSize,20);
        titleTextColor=mTypedArray.getColor(R.styleable.TitleBar_titleTextcolor,0);
        mTypedArray.recycle();
    }
    private void initView() {
        Log.e(TAG, "initView:"+backGroundColor);
        //背景
        setBackgroundColor(backGroundColor);
        //设置titleTextView居中
        titleTextView=new TextView(mContext);
        LayoutParams lp = (LayoutParams) titleTextView.getLayoutParams();
        //titleTextView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        //设定文字
        Log.e(TAG, "initView: "+titleText);
        titleTextView.setText(titleText);
        //设定文字颜色
        titleTextView.setTextColor(titleTextColor);
        //设定文字大小
        titleTextView.setTextSize(titleTextSize);
        //LayoutParams mLayoutParams=new LayoutParams(mContext,LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        addView(titleTextView);
        //设定左边button的drawble
        leftButton=new ImageButton(mContext);
        leftButton.setImageDrawable(leftDrawble);
        //右边
        rightButton=new ImageButton(mContext);
        rightButton.setImageDrawable(rightDrawble);
    }
}
