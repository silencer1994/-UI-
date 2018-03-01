package com.mapdemouitest.activitys;

import android.app.backup.RestoreObserver;
import android.support.test.espresso.core.deps.guava.collect.Table;
import android.support.test.uiautomator.By;

import com.mapdemouitest.core.BaseTestCase;

import org.junit.Test;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Administrator on 2017/3/21/021.
 */

public class LocationModeActivity extends BaseTestCase {
    @Test
    public void test(){
            waitMapInit("Location三种模式",true,1);
        device.findObject(By.res("com.leador.map.demo:id/gps_rotate_button")).click();
        sleep(1000);
        device.swipe(350, 1180, 350, 225, 100);
        sleep(2000);
        device.takeScreenshot(picturePath("Location旋转模式"));
        device.takeScreenshot(eyesLookPicture("Location旋转模式"));
        device.findObject(By.res("com.leador.map.demo:id/gps_follow_button")).click();
        sleep();
        device.swipe(350, 1180, 350, 225, 100);
        sleep(2000);
        device.takeScreenshot(picturePath("Location追随模式"));
        device.takeScreenshot(eyesLookPicture("Location追随模式"));
        sleep(1000);

    }
}
