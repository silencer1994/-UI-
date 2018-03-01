package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static android.R.attr.x;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class OfflineActivity extends BaseTestCase {
    @Test
    public void test(){
        waitMapInit("离线地图功能",true,2);
        device.findObject(By.text("离线地图功能")).click();
        sleep(2000);
        device.findObject(By.text("直辖市")).click();  
        sleep();
        device.takeScreenshot(picturePath("离线地图所有城市"));
        device.findObject(By.text("下载管理")).click();
        sleep();
        device.takeScreenshot(picturePath("离线地图下载管理"));
        sleep(1000);
    }
}
