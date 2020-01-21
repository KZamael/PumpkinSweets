package com.packtpub.libgdx.canyonbunny.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.packtpub.libgdx.canyonbunny.CanyonBunnyMain;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;

public class Main {
    private static boolean rebuildAtlas = true;
    private static boolean drawDebugOutline = false;

    public static void main(String[] arg) {

        if(rebuildAtlas){
            Settings settings = new Settings();
            settings.maxWidth = 1024;
            settings.maxHeight = 1024;
            settings.duplicatePadding = false;
            settings.debug = drawDebugOutline;
            // NOTE: packFileName: It can lead to problems, if the atlas file has the .pack extension. With .atlas, it seems to overwrite the atlas correctly.
            TexturePacker.process(settings, "assets-raw/images",
                    "android/assets/images", "canyonbunny");
            TexturePacker.process(settings, "assets-raw/images-ui",
                    "android/assets/images", "canyonbunny-ui");
        }

        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "PumpkinSweets";
        cfg.width = 800;
        cfg.height = 480;
        new LwjglApplication(new CanyonBunnyMain(), cfg);
    }
}
