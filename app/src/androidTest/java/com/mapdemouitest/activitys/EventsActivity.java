package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class EventsActivity extends BaseTestCase {
    @Test
    public void test() {
        waitMapInit("Events功能",false,1);
        UiObject2 mapView = device.findObject(By.res("com.leador.map.demo:id/map"));
        mapView.click();
        sleep(5000);
        device.swipe(403,855,206,608,20);
//        device.swipe(40)
        UiObject2 tvPressed = device.findObject(By.res("com.leador.map.demo:id/tap_text"));
        UiObject2 tvCameraChange = device.findObject(By.res("com.leador.map.demo:id/camera_text"));
        UiObject2 tvPointF = device.findObject(By.res("com.leador.map.demo:id/touch_text"));
        assertTrue(tvPressed.getText().contains("marker"));
        assertTrue(tvCameraChange.getText().contains("onCameraChange"));
        assertTrue(tvPointF.getText().contains("屏幕位置"));
        device.takeScreenshot(picturePath("Events功能界面图"));
        device.takeScreenshot(eyesLookPicture("Events功能界面图"));
        sleep(1000);
    }
}
