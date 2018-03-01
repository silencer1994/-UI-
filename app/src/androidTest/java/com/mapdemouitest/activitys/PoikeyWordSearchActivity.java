package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class PoikeyWordSearchActivity extends BaseTestCase {
    @Test
    public void test(){
            waitMapInit("poi关键字搜索",true,1);
            device.findObject(By.res("com.leador.map.demo:id/keyWord")).setText("lvrouhuo");
        sleep();
        device.takeScreenshot(picturePath("现在应该是有提示"));
        sleep();
        device.findObject(By.res("com.leador.map.demo:id/keyWord")).setText("驴肉火烧");
        device.findObject(By.res("com.leador.map.demo:id/keyWord")).click();
        device.pressBack();
        sleep();
        device.findObject(By.res("com.leador.map.demo:id/searchButton")).click();
        sleep(2000);
        device.takeScreenshot(picturePath("poi关键字搜索"));
        sleep(1000);
    }
}
