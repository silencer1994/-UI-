package com.mapdemouitest.activitys;

import android.graphics.Point;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class BaseMapActivity extends BaseTestCase{
    private String baseDemoUrl = "com.leador.map.demo:";
    private java.io.File filePath = this.picturePath("基本地图放大图");


    @Test
    public void test(){
         UiSelector uiSlector = new UiSelector();
      waitMapInit("基本地图",false,1);
//        UiObject mapView = device.findObject(By.res(baseDemoUrl + "id/map"));
        UiObject mapView = device.findObject(uiSlector.resourceId(baseDemoUrl + "id/map"));
//        performMultiPointerGesture (PointerCoords... touches)：
//        执行单手指触控手势，可定义任何手势和形状
//        performTwoPointerGesture (Point startPoint1, Point startPoint2, Point endPoint1, Point endPoint2, int steps)：
//        执行任意两个手指触控，模拟两个手指手势
//        pinchIn (int percent, int steps)：手指操作，两点向内收缩
//        pinchOut (int percent, int steps)：手指操作，两点向外扩展

        Point s1 = new Point(304,685);
        Point s2 = new Point(436,827);
        Point e1 = new Point(110,489);
        Point e2 = new Point(528,999);
        mapView.performTwoPointerGesture(s1, s2, e1, e2,100);
        sleep(2000);
        device.takeScreenshot(filePath);
        sleep(2000);
    }
}
