package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class DistrackActivity extends BaseTestCase {
    @Test
    public void test(){
        waitMapInit("行政区划边界查询",true,2);
        device.findObject(By.res("com.leador.map.demo:id/city_text")).setText("海淀");
        device.findObject(By.res("com.leador.map.demo:id/search_button")).click();
        sleep(2000);
        device.takeScreenshot(picturePath("行政区划边界查询"));
        sleep(1000);
    }
}
