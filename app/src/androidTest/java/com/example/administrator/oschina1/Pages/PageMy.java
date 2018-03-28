package com.example.administrator.oschina1.Pages;

import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina1.Common.Helper;

import java.security.PublicKey;

/**
 * Created by Administrator on 2018/3/22.
 */

public class PageMy {
    private Helper helper;

    public PageMy(Helper helper){
        this.helper = helper;
    }

    public UiObject2 getlog(){
        return helper.findId("net.oschina.app:id/iv_portrait");
    }

    public UiObject2 getMessage(){
        return helper.findId("net.oschina.app:id/rl_message");
    }

    public UiObject2 getRead(){
        return helper.findId("net.oschina.app:id/rl_read");
    }

    public UiObject2 getBlog(){
        return helper.findId("net.oschina.app:id/rl_blog");
    }

    public UiObject2 getQuestion(){
        return helper.findId("net.oschina.app:id/rl_info_question");
    }

    public UiObject2 getActivity(){
        return helper.findId("net.oschina.app:id/rl_info_activities");
    }

    public UiObject2 getTeam(){
        return helper.findId("net.oschina.app:id/rl_team");
    }

    public UiObject2 getShare(){
        return helper.findId("net.oschina.app:id/rl_share");
    }

    public UiObject2 getSetting(){
        return helper.findId("net.oschina.app:id/iv_logo_setting");
    }

    public void clickgetlog(){
        helper.click(getlog());
    }

    public void clickgetMessage(){
        helper.click(getMessage());
    }

    public void clickgetgetRead(){
        helper.click(getRead());
    }

    public void clickgetBlog(){
        helper.click(getBlog());
    }

    public void clickgetQuesition(){
        helper.click(getQuestion());
    }

    public void clickgetActivity(){
        helper.click(getActivity());
    }

    public void clickgetTeam(){
        helper.click(getTeam());
    }

    public void clickgetShare(){
        helper.click(getShare());
    }

    public void clickgetSetting(){
        helper.click(getSetting());
    }
}
