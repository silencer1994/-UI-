package com.mapdemouitest.activitys;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class GroundOverlayActivity extends BaseTestCase {
    @Test
    public void test(){
            waitMapInit("GroundOverlay功能",true,1);
        device.takeScreenshot(picturePath("GroundOverlay功能"));
        sleep(1000);
    }
}
