package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

/*
 * This class is the menu screen that the player sees after the splash screen
 */
public class MenuScreen implements Screen {

	final PoengGame game;
	OrthographicCamera camera;
	Music menuMusic;
	
	int screenWidth;
	int screenHeight;
	
	public MenuScreen(final PoengGame game){
		this.game = game;
		
		
		screenWidth = 1600;
		screenHeight = 900;
		camera = new OrthographicCamera();
		camera.setToOrtho(false, screenWidth, screenHeight);
		menuMusic = Gdx.audio.newMusic(Gdx.files.internal("data/bgm.ogg"));
		menuMusic.setLooping(true);
		menuMusic.play();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0f, 0f, 0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		// do stuff here
		game.batch.end();

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
