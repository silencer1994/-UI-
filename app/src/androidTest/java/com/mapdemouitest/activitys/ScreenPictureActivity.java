package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static android.support.test.uiautomator.Until.hasObject;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class ScreenPictureActivity extends BaseTestCase {
    @Test
    public void test(){
        waitMapInit("地图截屏功能",false,1);
        device.findObject(By.res("com.leador.map.demo:id/map_screenshot")).click();
        Boolean isScreened = device.wait(hasObject(By.text("截屏成功")), WAIT_TIMEOUT);
        assertTrue(isScreened);
        device.takeScreenshot(picturePath("地图截屏功能"));
        sleep(1000);
    }
}
