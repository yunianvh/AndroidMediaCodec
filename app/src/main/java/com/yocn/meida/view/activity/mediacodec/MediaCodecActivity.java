package com.yocn.meida.view.activity.mediacodec;

import android.os.Bundle;
import android.view.View;

import com.yocn.media.R;
import com.yocn.meida.base.DataProvider;
import com.yocn.meida.view.activity.BaseActivity;
import com.yocn.meida.view.widget.TopViewRecyclerView;

public class MediaCodecActivity extends BaseActivity {

    private TopViewRecyclerView topViewRecyclerView;
    public static String DESC = "mediacodec";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    protected void initView(View root) {
        topViewRecyclerView = root.findViewById(R.id.tvrv_main);
    }

    protected void initData() {
        topViewRecyclerView.setActivity(this, DataProvider.Type.MEDIA_CODEC);
    }

}