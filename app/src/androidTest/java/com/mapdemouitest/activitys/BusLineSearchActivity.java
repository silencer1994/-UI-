package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static android.support.test.uiautomator.Until.hasObject;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class BusLineSearchActivity extends BaseTestCase {
    @Test
    public void test(){
            waitMapInit("Busline公交查询",true,2);
        device.findObject(By.res("com.leador.map.demo:id/busName")).setText("115");
        device.findObject(By.res("com.leador.map.demo:id/searchbyname")).click();
        sleep(1000);
        device.click(282, 184);
        sleep(1000);
        device.takeScreenshot(picturePath("线路名称查询"));
        sleep(2000);
        device.findObject(By.res("com.leador.map.demo:id/busName")).setText("海淀黄庄");
        device.findObject(By.res("com.leador.map.demo:id/searchbystationname")).click();
        Boolean isSearched = device.wait(hasObject(By.textContains("海淀黄庄")), WAIT_TIMEOUT);
        assertTrue(isSearched);
    }
}
