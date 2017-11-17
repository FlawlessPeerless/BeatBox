package com.magicsu.android.beatbox.asset;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * Created by 36268 on 2017/11/17.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";

    private static final String SOUND_FOLDER = "sample_sounds";

    private AssetManager mAsset;

    public BeatBox(Context context){
        mAsset = context.getAssets();
    }
}
