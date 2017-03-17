package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.PoengGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Poeng";
		config.useGL30 = true;
		config.width = 1250;
		config.height = 700;
		config.foregroundFPS = 60;
		new LwjglApplication(new PoengGame(), config);
	}
}
