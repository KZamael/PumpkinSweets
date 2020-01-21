package com.packtpub.libgdx.canyonbunny.util;

import com.badlogic.gdx.Gdx;

public class Constants {

    // Number of Carrots to spawn
    public static final int CARROTS_SPAWN_MAX = 100;

    // Spawn radius for Carrots
    public static final float CARROTS_SPAWN_RADIUS = 3.5f;

    // Delay after game finished
    public static final float TIME_DELAY_GAME_FINISHED = 6;

    // Visible game world is 5 meters wide
    public static final float VIEWPORT_WIDTH = 5.0f;
    // Visible game world is 5 meters tall
    public static final float VIEWPORT_HEIGHT = 5.0f;

    // GUI Width
    public static final float VIEWPORT_GUI_WIDTH = 800.0f;
    // GUI Height
    public static final float VIEWPORT_GUI_HEIGHT = 480.0f;

    // Location of description file for texture atlas
    public static final String TEXTURE_ATLAS_OBJECTS = "android/assets/images/canyonbunny.atlas";

    // Location of image file for level 01
    public static final String LEVEL_01 = "android/assets/levels/level-01.png";

    //Amount of extra lives at level start
    public static final int LIVES_START = 3;

    public static final float ITEM_FEATHER_POWERUP_DURATION = 9;

    public static final float TIME_DELAY_GAME_OVER = 3;

    public static final String TEXTURE_ATLAS_UI = "android/assets/images/canyonbunny-ui.atlas";

    public static final String TEXTURE_ATLAS_LIBGDX_UI = "android/assets/images/uiskin.atlas";

    // Location of description file for skins
    public static final String SKIN_LIBGDX_UI = "android/assets/images/uiskin.json";

    public static final String SKIN_CANYONBUNNY_UI = "android/assets/images/canyonbunny-ui.json";

    public static final String PREFERENCES = "canyonbunny.preferences";

    // Shader
    public static final String shaderMonochromeVertex = "android/assets/shaders/monochrome.vs";

    public static final String shaderMonochromeFragment = "android/assets/shaders/monochrome.fs";

    // Angle of rotation for dead zone (no movement)
    public static final float ACCEL_ANGLE_DEAD_ZONE = 5.0f;

    // Max angle of rotation needed to gain max movement velocity
    public static final float ACCEL_MAX_ACNGLE_MAX_MOVEMENT = 20.0f;
}