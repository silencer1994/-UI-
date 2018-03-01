package com.mapdemouitest.activitys;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class MapOptionsActivity extends BaseTestCase{
    @Test
    public void test(){
        waitMapInit("MapOptions实现地图",false,1);
        clickZoomOut();
        sleep();
        device.takeScreenshot(picturePath("MapOptions实现地图"));
        sleep(2000);
    }
}
