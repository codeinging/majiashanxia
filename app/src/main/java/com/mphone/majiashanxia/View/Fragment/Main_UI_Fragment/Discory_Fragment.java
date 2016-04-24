package com.mphone.majiashanxia.View.Fragment.Main_UI_Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.mphone.majiashanxia.Model.ADInfo;
import com.mphone.majiashanxia.R;
import com.mphone.majiashanxia.Utils.AdUtils;
import com.mphone.majiashanxia.View.ImageCycleView;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

/**
 * Created by syd on 2016/4/19.
 */
public class Discory_Fragment extends Fragment implements ImageCycleView.ImageCycleViewListener {
    private ImageCycleView mAdView;
    private ArrayList<ADInfo> infos = new ArrayList<ADInfo>();
    private ArrayList<ADInfo> infos2 = new ArrayList<ADInfo>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        infos= AdUtils.getdisCover_Adinfos();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView=inflater.inflate(R.layout.mainui_discover_fragment,container,false);
        mAdView = (ImageCycleView) mView.findViewById(R.id.ad_view);
        mAdView.setImageResources(infos, this);
        return mView;
    }
    @Override
    public void onResume() {
        super.onResume();
        mAdView.startImageCycle();
    }

    @Override
    public void onPause() {
        super.onPause();
        mAdView.pushImageCycle();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mAdView.pushImageCycle();
    }

    /**
     * 加载图片资源
     *
     * @param imageURL
     * @param imageView
     */
    @Override
    public void displayImage(String imageURL, ImageView imageView) {
        ImageLoader.getInstance().displayImage(imageURL, imageView);// 使用ImageLoader对图片进行加装！

    }

    /**
     * 单击图片事件
     *
     * @param info
     * @param postion
     * @param imageView
     */
    @Override
    public void onImageClick(ADInfo info, int postion, View imageView) {
        Toast.makeText(getActivity().getApplicationContext(), "content->"+info.getContent(), Toast.LENGTH_SHORT).show();

    }
}
