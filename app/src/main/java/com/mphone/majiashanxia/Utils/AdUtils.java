package com.mphone.majiashanxia.Utils;

import com.mphone.majiashanxia.Constants.Contants;
import com.mphone.majiashanxia.Model.ADInfo;

import java.util.ArrayList;

/**
 * Created by syd on 2016/4/23.
 */
public class AdUtils {
    public static ArrayList<ADInfo> adInfos =new ArrayList<>();
    public static ArrayList<ADInfo> getdisCover_Adinfos(){
        if (adInfos.size()==0){
             for(int i = 0; i < Contants.discover_Ad_imageUrls.length; i ++){
                ADInfo info = new ADInfo();
                info.setUrl(Contants.discover_Ad_imageUrls[i]);
                info.setContent("top-->" + i);
                adInfos.add(info);
            }
        }
        return adInfos;
    }
}
