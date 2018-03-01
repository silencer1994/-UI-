package com.mapdemouitest.activitys;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class ArcActivity extends BaseTestCase {
    @Test
    public void test() {
        waitMapInit("Arc功能", true, 1);
        device.takeScreenshot(picturePath("Arc功能"));
        sleep(1000);
    }
}
