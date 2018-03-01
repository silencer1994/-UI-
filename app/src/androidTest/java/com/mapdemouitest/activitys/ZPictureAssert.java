package com.mapdemouitest.activitys;

/**
 * Created by Administrator on 2017/3/22/022.
 */

import android.os.Environment;
import android.util.Log;

import com.mapdemouitest.util.Picture;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

/**
 * 为了使这个类在最后执行,故取名为Z开头
 */
@RunWith(JUnit4.class)
public class ZPictureAssert {
    String[] pictureNames = new String[]{"UiSetting", "Location追随模式", "Location旋转模式","SupportmapFragment放大图", "地图截屏功能", "步行路线查询", "驾车路线查询",
            "公交路线查询", "Polygons功能", "Polylines功能", "poi关键字搜索", "现在应该是有提示", "poi下一页", "poi区域搜索", "poi周边搜索", "地图poi点击功能",
            "Opengl接口功能", "离线地图下载管理", "离线地图所有城市", "NavigateArrow功能", "Markers功能", "MapOptions实现地图",
            "本地POI首字母搜索", "本地POI关键字搜索", "交通状况黑夜图", "GroundOverlay功能", "逆地理编码", "地理编码", "Events功能界面图", "行政区划边界查询",
            "自定义地图样式", "Circles功能", "动画到郑州成功", "线路名称查询", "基本地图放大图", "Arc功能"};
//    String[] pictureNames = new String[]{"交通状况黑夜图"};
    String[] dynamicPictures = new String[]{"UiSetting", "Location追随模式", "Location旋转模式", "动画到郑州取消",};
    String[] fillterPicture = new String[]{
            //这些被过滤掉对比的图片在eyeLookPicture文件夹下，目前先眼看结果
            "UiSetting",
            "Location追随模式",
            "Location旋转模式",
            "动画到郑州取消",
            //TODO
            "Events功能界面图",
    };
    //    String[] fillterPicture = new String[]{};
    boolean isFillter = false;

    @Test
    public void testPictureNames() {
        for (int i = 0; i < pictureNames.length; i++) {
            //过滤器,过滤掉不想对比的图片
            for (int j = 0; j < fillterPicture.length; j++) {
                if (fillterPicture[j].equals(pictureNames[i])) {
                    isFillter = true;
                }
            }
            if (!isFillter) {
                String picturePath = Environment.getExternalStorageDirectory()
                        .getAbsolutePath() + File.separator + "mapDemoUi" + File.separator + pictureNames[i] + ".jpg";
                String assertPicturePath = Environment.getExternalStorageDirectory()
                        .getAbsolutePath() + File.separator + "AssertPicture" + File.separator + pictureNames[i] + ".jpg";
                Log.e("ASDF", "PictureName: "+pictureNames[i] );
                double simpler = Picture.similarity(picturePath, assertPicturePath);
                assertThat(simpler, greaterThan(0.70));
            }
            isFillter = false;
        }
    }
}
