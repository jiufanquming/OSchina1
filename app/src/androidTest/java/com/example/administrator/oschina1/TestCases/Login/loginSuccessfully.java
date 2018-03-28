package com.example.administrator.oschina1.TestCases.Login;

import com.example.administrator.oschina1.Common.BasicTestCase;

import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by Administrator on 2018/3/23.
 */

public class loginSuccessfully extends BasicTestCase{

    @Test
    public void name() throws Exception {
        pm.getPageCommon().getToMyTab();
        pm.getPageMy().clickgetlog();
        pm.getPageLogin().entergetUserName("15010685335");
        pm.getPageLogin().entergetPWD("888888");
        pm.getPageLogin().clickgetLoginBtn();

    }
}
