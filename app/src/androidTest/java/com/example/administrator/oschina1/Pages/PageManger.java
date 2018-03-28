package com.example.administrator.oschina1.Pages;

import com.example.administrator.oschina1.Common.Helper;

/**
 * Created by Administrator on 2018/3/22.
 */

/**
 * 每新增一个page类，就需要到pageManger这个管理类中添加获取这个page类的get方法
 */
public class PageManger {

    private Helper helper;
    private PageMy PageMy;
    private PageLogin PageLogin;
    private PageCommon PageCommon;


    public PageManger(Helper helper){
        this.helper = helper;
    }

    public PageMy getPageMy(){
        if (PageMy == null){
            PageMy = new PageMy(helper);
         }
        return PageMy;
    }
    public PageCommon getPageCommon(){
        if (PageCommon == null){
            PageCommon = new PageCommon(helper);
         }
        return PageCommon;
    }

    public PageLogin getPageLogin(){
        if (PageLogin == null){
            PageLogin = new PageLogin(helper);
          }
        return PageLogin;
    }
}
