package com.example.administrator.oschina1.Pages;

import android.provider.Contacts;
import android.support.test.uiautomator.UiObject2;

import com.example.administrator.oschina1.Common.Helper;

/**
 * Created by Administrator on 2018/3/22.
 */

public class PageLogin {

    private Helper helper;

    public PageLogin(Helper helper) {
        this.helper = helper;
    }

    public UiObject2 getUserName() {
        return helper.findId("net.oschina.app:id/et_login_username");
    }

    public void entergetUserName(String name){
        helper.enterText(getUserName(),name);
    }

    public void cleargetUserName(){
        helper.clearEditText(getUserName());
    }

    public UiObject2 getPWD() {
        return helper.findId("net.oschina.app:id/et_login_pwd");
    }

    public void entergetPWD(String pwd){
        helper.enterText(getPWD(),pwd);
    }

    public void cleargetPWD(){
        helper.clearEditText(getPWD());
    }

    public UiObject2 getForgetPwd(){
        return helper.findId("net.oschina.app:id/tv_login_forget_pwd");
    }

    public void clickgetForgetPwd(){
        helper.click(getForgetPwd());
    }

    public UiObject2 getLoginBtn(){
        return helper.findId("net.oschina.app:id/bt_login_submit");
    }

    public void clickgetLoginBtn(){
        helper.click(getLoginBtn());
    }

    public UiObject2 getRegisterBtn(){
        return helper.findId("net.oschina.app:id/bt_login_register");
    }

    public void clickgetRegistersion(){
        helper.click(getRegisterBtn());
    }


    public UiObject2 getBackBtn(){
        return helper.findId("net.oschina.app:id/ib_navigation_back");
    }

    public void clickgetBackBtn(){
        helper.click(getBackBtn());
    }


    /**
     * 封装下拉选择其他登录方式按钮
     * @return
     */
    public UiObject2 getPullBtn(){
        return helper.findId("net.oschina.app:id/ll_login_pull");
    }

    public void clickgetPullBtn(){
        helper.click(getPullBtn());
    }

}