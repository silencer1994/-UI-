package com.mapdemouitest.activitys;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class PolyLinesActivity extends BaseTestCase {
    @Test
    public void test() {
        waitMapInit("Polylines功能", false, 1);
        //将seekBar调整为最大值
        device.click(677, 232);
        device.click(677, 294);
        //为了断定图片是否为虚线,所以注释掉
//        device.click(677, 360);
        sleep(1000);
        device.takeScreenshot(picturePath("Polylines功能"));
        sleep(1000);
    }
}
