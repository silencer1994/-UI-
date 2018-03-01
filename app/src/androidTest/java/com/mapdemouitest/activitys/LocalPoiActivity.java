package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class LocalPoiActivity extends BaseTestCase{
    @Test
    public void test(){
        waitMapInit("本地POI关键字搜索",true,2);
        device.takeScreenshot(picturePath("本地POI关键字搜索"));
        sleep(2000);
        device.pressBack();
        device.findObject(By.text("本地POI首字母搜索")).click();
        sleep(5000);
        device.takeScreenshot(picturePath("本地POI首字母搜索"));
        sleep(1000);
    }
}
