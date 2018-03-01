package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import java.util.regex.Pattern;

import static android.support.test.uiautomator.Until.hasObject;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class GeocoderActivity extends BaseTestCase {
    @Test
    public void test() {
        waitMapInit("地理编码 功能", true, 1);
        device.findObject(By.res("com.leador.map.demo:id/geoButton")).click();
//        Boolean isGeocodered = device.wait(hasObject(By.textContains("经纬度值")), WAIT_TIMEOUT);
        device.takeScreenshot(picturePath("地理编码"));
//        assertTrue(isGeocodered);
        sleep(2000);
        device.findObject(By.res("com.leador.map.demo:id/regeoButton")).click();
//        Boolean isRegeoed = device.wait(hasObject(By.textContains("北京市")), WAIT_TIMEOUT);
//        assertTrue(isRegeoed);
        device.takeScreenshot(picturePath("逆地理编码"));
        sleep(1000);
        //TODO
//        Pattern regex = new Pattern();
//        isGeocodered = device.wait(hasObject(By.text(regex)));
    }
}
