package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class RouteCaculateActivity extends BaseTestCase{
    @Test
    public void test(){
            waitMapInit("Route路径规划",true,2);
            device.findObject(By.res("com.leador.map.demo:id/imagebtn_roadsearch_startoption")).click();
        device.click(288,813);
        sleep();
        device.findObject(By.text("点击选择为起点")).click();
        device.findObject(By.res("com.leador.map.demo:id/imagebtn_roadsearch_endoption")).click();
        device.click(485, 938);
        sleep();
        device.findObject(By.text("点击选择为目的地")).click();
        device.findObject(By.res("com.leador.map.demo:id/imagebtn_roadsearch_search")).click();
        sleep(2000);
        device.takeScreenshot(picturePath("公交路线查询"));
        device.findObject(By.res("com.leador.map.demo:id/imagebtn_roadsearch_tab_driving")).click();
        device.findObject(By.res("com.leador.map.demo:id/imagebtn_roadsearch_search")).click();
        sleep(2000);
        device.takeScreenshot(picturePath("驾车路线查询"));
        device.findObject(By.res("com.leador.map.demo:id/imagebtn_roadsearch_tab_walk")).click();
        device.findObject(By.res("com.leador.map.demo:id/imagebtn_roadsearch_search")).click();
        sleep(2000);
        device.takeScreenshot(picturePath("步行路线查询"));
        sleep(1000);
    }
}
