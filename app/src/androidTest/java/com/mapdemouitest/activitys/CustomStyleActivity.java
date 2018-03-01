package com.mapdemouitest.activitys;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class CustomStyleActivity extends BaseTestCase {
    @Test
    public void test(){
//        device.swipe(350, 1180, 350, 225, 1);
//        sleep(50000);
        waitMapInit("自定义地图样式",true,2);
        device.takeScreenshot(picturePath("自定义地图样式"));
        sleep(1000);
    }
}
