package com.magicsu.android.beatbox.asset;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.magicsu.android.beatbox.model.Sound;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36268 on 2017/11/17.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUND_FOLDER = "sample_sounds";

    private AssetManager mAsset;

    private List<Sound> mSounds = new ArrayList<>();

    public BeatBox(Context context){
        mAsset = context.getAssets();
        loadSound();
    }

    private void loadSound() {
        String[] soundNames;
        try {
            soundNames = mAsset.list(SOUND_FOLDER);
            Log.i(TAG, "Found "+ soundNames.length +" sounds");
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "加载资源失败", e);
            return;
        }

        for (String filename : soundNames) {
            String assetPath = SOUND_FOLDER + "/" + filename;
            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }
    }

    public List<Sound> getSounds() {
        return mSounds;
    }
}