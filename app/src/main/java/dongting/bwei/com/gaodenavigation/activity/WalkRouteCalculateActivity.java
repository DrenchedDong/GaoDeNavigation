package dongting.bwei.com.gaodenavigation.activity;

import android.os.Bundle;

import com.amap.api.navi.AMapNaviView;
import com.amap.api.navi.enums.NaviType;
import com.amap.api.navi.model.NaviLatLng;

import dongting.bwei.com.gaodenavigation.R;


public class WalkRouteCalculateActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_navi);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);
        mAMapNaviView.setNaviMode(AMapNaviView.NORTH_UP_MODE);

    }

    @Override
    public void onInitNaviSuccess() {
        super.onInitNaviSuccess();
        mAMapNavi.calculateWalkRoute(new NaviLatLng(39.925846, 116.435765), new NaviLatLng(39.925846, 116.532765));

    }

    @Override
    public void onCalculateRouteSuccess() {
        super.onCalculateRouteSuccess();
        mAMapNavi.startNavi(NaviType.GPS);
    }
}
