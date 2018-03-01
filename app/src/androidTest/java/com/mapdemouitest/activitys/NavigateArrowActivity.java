package com.mapdemouitest.activitys;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class NavigateArrowActivity extends BaseTestCase {
    @Test
    public void test(){
            waitMapInit("NavigateArrow功能",true,1);
        device.takeScreenshot(picturePath("NavigateArrow功能"));
        sleep(1000);
    }
}
