package com.example.administrator.oschina1.Common;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;

import com.example.administrator.oschina1.Pages.PageManger;

import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by Administrator on 2018/3/21.
 */

/**
 *
 */
@RunWith(AndroidJUnit4.class)
public class BasicTestCase {
   private UiDevice device;
   private final String PACKAGE_HOME = "net.oschina.app";
   private Helper helper;
   public PageManger pm;
    @Before
    public void setUp() throws Exception {

        //实例化UiDivice
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        helper = new Helper(device);
        pm = new PageManger(helper);
        //启动应用，获取上下文
        Context context = InstrumentationRegistry.getContext();
        //通过将包名传给包管理器获取启动的intent
        final Intent intent = context.getPackageManager().getLaunchIntentForPackage(PACKAGE_HOME);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //启动应用
        context.startActivity(intent);
        //等待应用启动
        device.wait(Until.hasObject(By.res("")),5000);
    }
}
