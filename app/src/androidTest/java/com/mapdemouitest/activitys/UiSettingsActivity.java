package com.mapdemouitest.activitys;

import android.graphics.Point;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;
import android.view.ViewDebug;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static android.support.test.uiautomator.Until.hasObject;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class UiSettingsActivity extends BaseTestCase {
    @Test
    public void test() {
        waitMapInit("UI Settings功能", false, 1);
        device.findObject(By.res("com.leador.map.demo:id/scale_toggle")).click();
        device.findObject(By.res("com.leador.map.demo:id/buttonScale")).click();
        Boolean isScaled = device.wait(hasObject(By.text("每像素代表117.238205米")), WAIT_TIMEOUT);
        assertTrue(isScaled);
        Direction direction = Direction.DOWN;
        float percent = 16f;
        int speed = 120;
//        向下滑动
        device.findObject(By.res("com.leador.map.demo:id/zoom_toggle")).scroll(direction, percent,speed);
        sleep(2000);
        device.findObject(By.res("com.leador.map.demo:id/zoom_center_right")).click();
        device.findObject(By.res("com.leador.map.demo:id/compass_toggle")).click();
        device.findObject(By.res("com.leador.map.demo:id/mylocation_toggle")).click();
        //向下滑动
        percent = 40;
        device.findObject(By.res("com.leador.map.demo:id/zoom_center_right")).scroll(direction, percent,speed);
        device.findObject(By.res("com.leador.map.demo:id/bottom_center")).click();
        device.swipe(404,761,541,892,20);
        doubleClick(device,412,830);
        UiObject mapView = device.findObject(new UiSelector().resourceId("com.leador.map.demo:id/map"));
        Point s1 = new Point(363,1049);
        Point s2 = new Point(467,502);
        Point e1 = new Point(463,949);
        Point e2 = new Point(367,402);
        mapView.performTwoPointerGesture(s1, s2, e1, e2,100);
        sleep(1000);
        device.takeScreenshot(picturePath("UiSettings"));
        device.takeScreenshot(eyesLookPicture("UiSettings"));
        sleep(2000);
    }
}
