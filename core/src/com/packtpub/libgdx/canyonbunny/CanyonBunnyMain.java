package com.packtpub.libgdx.canyonbunny;

import com.packtpub.libgdx.canyonbunny.screens.DirectedGame;
import com.packtpub.libgdx.canyonbunny.game.WorldController;
import com.packtpub.libgdx.canyonbunny.game.WorldRenderer;
import com.packtpub.libgdx.canyonbunny.util.AudioManager;
import com.packtpub.libgdx.canyonbunny.util.GamePreferences;


import com.packtpub.libgdx.canyonbunny.screens.transitions.ScreenTransition;
import com.packtpub.libgdx.canyonbunny.screens.transitions.ScreenTransitionsSlice;

import com.packtpub.libgdx.canyonbunny.game.Assets;
import com.packtpub.libgdx.canyonbunny.screens.MenuScreen;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.assets.AssetManager;

public class CanyonBunnyMain extends DirectedGame {

    private static final String TAG = CanyonBunnyMain.class.getName();


    @Override
    public void create() {
        // Set LibGdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        // Load assets
        Assets.instance.init(new AssetManager());

        // Load preferences for audio settings and start playing music
        GamePreferences.instance.load();
        AudioManager.instance.play(Assets.instance.music.song01);

        // Start game at menu screen and activate Slice-Transition headfirst
        ScreenTransition transition = ScreenTransitionsSlice.init(
                2, ScreenTransitionsSlice.UP_DOWN, 10,
                Interpolation.pow5Out);

        setScreen(new MenuScreen(this), transition);
    }
}
