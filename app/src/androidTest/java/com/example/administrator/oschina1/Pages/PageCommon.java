package com.example.administrator.oschina1.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina1.Common.Helper;

/**
 * Created by Administrator on 2018/3/21.
 */

public class PageCommon {

    private  Helper helper;

    public PageCommon(Helper helper){
        this.helper = helper;

    }


    public UiObject2 getZhTab() {
        return helper.findID("net.oschina.app:id/nav_tv_title", 0);
    }

    public UiObject2 getDtTab() {
        return helper.findID("net.oschina.app:id/nav_tv_title", 1);
    }

    public UiObject2 clickTjBtn() {
        return helper.findId("net.oschina.app:id/nav_item_tweet_pub");
    }

    public UiObject2 getFxTab() {
        return helper.findID("net.oschina.app:id/nav_tv_title", 2);
    }

    public UiObject2 getMyTab() {
        return helper.findID("net.oschina.app:id/nav_tv_title", 3);
    }



    public void getToZhTab(){
        helper.click(getZhTab());
    }

    public void getToDtTab(){
        helper.click(getDtTab());

    }

    public void clickToTjBtn(){
        helper.click(clickTjBtn());
    }

    public void getToMyTab(){
        helper.click(getMyTab());
    }

    public void getToFxTab(){
        helper.click(getFxTab());
    }
}
