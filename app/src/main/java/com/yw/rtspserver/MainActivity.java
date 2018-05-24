package com.yw.rtspserver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import net.majorkernelpanic.streaming.SessionBuilder;
import net.majorkernelpanic.streaming.gl.SurfaceView;
import net.majorkernelpanic.streaming.video.VideoQuality;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.surfaceView);

        SessionBuilder.getInstance()
                .setAudioEncoder(SessionBuilder.AUDIO_NONE)
                .setVideoEncoder(SessionBuilder.VIDEO_H264)
                .setVideoQuality(VideoQuality.DEFAULT_VIDEO_QUALITY)
                .setSurfaceView(surfaceView)
                .setCamera(0)
                .setContext(getApplicationContext());

        startService(new Intent(this, CustomRtspServer.class));
    }
}
