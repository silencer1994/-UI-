package com.mapdemouitest.activitys;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static android.support.test.uiautomator.Until.hasObject;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class LayersActivity extends BaseTestCase{
    @Test
    public void test(){
        waitMapInit("Layers图层功能",false,1);
        UiObject2 mapView = device.findObject(By.res("com.leador.map.demo:id/map"));
        device.findObject(By.res("com.leador.map.demo:id/traffic")).click();
//        doubleClick(mapView);
        doubleClick(device,341,703);
        doubleClick(device,341,703);
        sleep(2000);
//        List<UiObject2> objects = device.findObjects(By.clazz(ImageView.class));
//        objects.get(0).click();
        sleep(2000);
        device.findObject(By.res("com.leador.map.demo:id/layers_spinner")).click();
        device.wait(hasObject(By.text("Night")),WAIT_TIMEOUT);
        device.findObject(By.text("Night")).click();
        sleep(3000);
//        doubleClick(device,);
        device.takeScreenshot(picturePath("交通状况黑夜图"));
        sleep(1000);
    }

}
