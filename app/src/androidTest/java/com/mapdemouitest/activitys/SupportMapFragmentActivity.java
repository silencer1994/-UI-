package com.mapdemouitest.activitys;

import android.graphics.Point;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class SupportMapFragmentActivity extends BaseTestCase{
    private String baseDemoUrl = "com.leador.map.demo:";
    private java.io.File filePath = this.picturePath("SupportmapFragment放大图");
    @Test
    public void test(){
        UiSelector uiSlector = new UiSelector();
        waitMapInit("SupportMapFragment创建地图",false,1);
        UiObject mapView = device.findObject(uiSlector.resourceId(baseDemoUrl + "id/map"));
        Point s1 = new Point(304,685);
        Point s2 = new Point(436,827);
        Point e1 = new Point(110,489);
        Point e2 = new Point(528,999);
        mapView.performTwoPointerGesture(s1, s2, e1, e2,100);
        sleep(2000);
        device.takeScreenshot(filePath);
        sleep(1000);
    }
}
