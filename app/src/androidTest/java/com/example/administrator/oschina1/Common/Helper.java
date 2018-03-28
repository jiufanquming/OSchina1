package com.example.administrator.oschina1.Common;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;

/**
 * Created by Administrator on 2018/3/21.
 */

public class Helper {
    private UiDevice device;

    // 定义默认超时时间为5s
    private final int DEFAULT_TIME = 5000;

    public Helper(UiDevice device){
        this.device = device;

    }
 // 封装按ID定位方式
    public UiObject2 findId(String id){
        device.wait(Until.hasObject(By.res(id)),DEFAULT_TIME);
        return device.findObject(By.res(id));
    }

    // 封装按ID定位（有多个ID，返回为列表）
    public UiObject2 findID(String id,int index){
        device.wait(Until.hasObject(By.res(id)),DEFAULT_TIME);
        return device.findObjects(By.res(id)).get(index);
    }

    //封装按文本（text）定位
    public UiObject2 fingText(String text){
        device.wait(Until.hasObject(By.text(text)),DEFAULT_TIME);
        return device.findObject(By.text(text));
    }

    //封装按文本（多个文本，返回列表）

    public UiObject2 findText(String text,int index){
        device.wait(Until.hasObject(By.text(text)),DEFAULT_TIME);
        return device.findObjects(By.text(text)).get(index);
    }
   //
    public UiObject2 findContentdesc(String contentdesc){
        device.wait(Until.hasObject(By.desc(contentdesc)),DEFAULT_TIME);
        return device.findObject(By.desc(contentdesc));
    }

    public void click(UiObject2 obj) {
        obj.click();
    }

    public void enterText(UiObject2 editText,String text){
        editText.setText(text);
    }

    public void clearEditText(UiObject2 EditText){
        EditText.clear();
    }

}
