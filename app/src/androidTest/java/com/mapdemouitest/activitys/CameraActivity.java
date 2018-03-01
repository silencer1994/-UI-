package com.mapdemouitest.activitys;

import android.graphics.Point;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.uiautomator.Until.hasObject;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2017/3/20/020.
 */

public class CameraActivity extends BaseTestCase{
    private String baseDemoUrl = "com.leador.map.demo:";
    private java.io.File filePath = this.picturePath("Camera放大图");


    @Test
    public void test(){
        UiSelector uiSlector = new UiSelector();
        waitMapInit("Camera功能",false,1);
        UiObject2 zhenZhou = device.findObject(By.res("com.leador.map.demo:id/zhengzhou"));
        zhenZhou.click();
        sleep(50);
        UiObject2 stop = device.findObject(By.res("com.leador.map.demo:id/stop_animation"));
        stop.click();
        //TODO
//        Boolean isCancle = device.wait(hasObject(By.textContains("取消")), WAIT_TIMEOUT);
//        assertTrue(isCancle);
        device.takeScreenshot(picturePath("动画到郑州取消"));
        device.takeScreenshot(eyesLookPicture("动画到郑州取消"));
        sleep(1000);
        zhenZhou.click();
        sleep(3000);
        device.takeScreenshot(picturePath("动画到郑州成功"));
        UiObject2 zoomIn = device.findObject(By.res("com.leador.map.demo:id/zoom_out"));
        zoomIn.click();
        sleep(2000);
        zoomIn.click();
        sleep(2000);


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
        sleep(1000);
    }
}
