package com.mapdemouitest.activitys;

import android.util.Log;

import com.mapdemouitest.core.BaseTestCase;
import com.mapdemouitest.util.DensityUtil;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class PoiClickActivity extends BaseTestCase {
    @Test
    public void test() {
        waitMapInit("地图Poi点击功能", false, 1);
        Log.e("ASDF", "x: " + DensityUtil.px2dip(context, 660)+"    "+
        DensityUtil.px2dip(context, 1216));

        device.click(DensityUtil.dip2px(context,192), DensityUtil.dip2px(context,368));
//        Boolean isClick = device.wait(hasObject(By.text("北京")), WAIT_TIMEOUT);
//        assertTrue(isClick);
        sleep(1000);
        device.takeScreenshot(picturePath("地图Poi点击功能"));
        sleep(2000);
    }
}
