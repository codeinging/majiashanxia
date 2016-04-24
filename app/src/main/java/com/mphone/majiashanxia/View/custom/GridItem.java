package com.mphone.majiashanxia.View.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mphone.majiashanxia.R;

/**
 * Created by syd on 2016/4/23.
 */
public class GridItem extends LinearLayout {
    private ImageView imageView;
    private Drawable drawable;
    private TextView mTextView;
    private float textSize;
    private int drawbleSize;
    private String text;
    private Context mContext;
    public GridItem(Context context) {
        super(context);
        this.mContext=context;

    }
    public GridItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext=context;
        getfromXml(attrs);
        initView();
    }
    public GridItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;

    }

    private void initView() {
        setOrientation(VERTICAL);
        LayoutParams mLayoutParams=new LayoutParams(drawbleSize, drawbleSize);
        imageView=new ImageView(mContext);
        imageView.setImageDrawable(drawable);
        addView(imageView,mLayoutParams);
        mTextView=new TextView(mContext);
        mTextView.setText(text);
        mTextView.setPadding(0,10,0,0);
        mTextView.setTextSize(textSize);
        mTextView.setGravity(Gravity.CENTER);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
//            mTextView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
//        }
//
        addView(mTextView,new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

    }
    private void getfromXml(AttributeSet attributeSet) {
        TypedArray mTypedArray=mContext.obtainStyledAttributes(attributeSet,R.styleable.GridItem);
        drawable=mTypedArray.getDrawable(R.styleable.GridItem_drawble);
        textSize=mTypedArray.getDimension(R.styleable.GridItem_textSize,20);
        text=mTypedArray.getString(R.styleable.GridItem_text);
        drawbleSize= (int) mTypedArray.getDimension(R.styleable.GridItem_drawbleSize,80);
        mTypedArray.recycle();
    }

}
