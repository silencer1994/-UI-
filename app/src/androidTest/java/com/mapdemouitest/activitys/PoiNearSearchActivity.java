package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;
import android.text.method.MultiTapKeyListener;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class PoiNearSearchActivity extends BaseTestCase{
    @Test
    public void test(){
            waitMapInit("poi周边搜索",true,1);
        device.findObject(By.res("com.leador.map.demo:id/keyWord")).setText("驴肉火烧");
        device.findObject(By.res("com.leador.map.demo:id/searchButton")).click();
        sleep(1000);
        device.takeScreenshot(picturePath("poi周边搜索"));
        device.findObject(By.res("com.leador.map.demo:id/searchBoundButton")).click();
        sleep(1000);
        device.takeScreenshot(picturePath("poi区域搜索"));
        device.findObject(By.res("com.leador.map.demo:id/nextButton")).click();
        sleep(1000);
        device.takeScreenshot(picturePath("poi下一页"));
        sleep(1000);
    }
}
