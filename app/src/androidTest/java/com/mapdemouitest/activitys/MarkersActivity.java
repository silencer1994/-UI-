package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class MarkersActivity extends BaseTestCase{
    @Test
    public void test(){
            waitMapInit("Markers功能",true,1);
        device.findObject(By.res("com.leador.map.demo:id/custom_info_window")).click();
        device.findObject(By.res("com.leador.map.demo:id/resetMap")).click();
        sleep(1000);
        device.takeScreenshot(picturePath("Markers功能"));
        sleep(1000);
    }
}
