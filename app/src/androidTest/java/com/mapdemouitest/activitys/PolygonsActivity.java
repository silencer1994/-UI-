package com.mapdemouitest.activitys;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class PolygonsActivity extends BaseTestCase{
    @Test
    public void test(){
            waitMapInit("Polygons功能",true,1);
        device.click(677,232);
        device.click(677, 294);
        device.click(677, 360);
        sleep(1000);
        device.takeScreenshot(picturePath("Polygons功能"));
        sleep(1000);
    }
}
