package com.mapdemouitest.activitys;

import android.view.ViewDebug;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class OpenglActivity extends BaseTestCase {
    @Test
    public void test() {
        waitMapInit("Opengl接口功能", false, 1);
        device.takeScreenshot(picturePath("Opengl接口功能"));
        sleep(1000);
    }
}
