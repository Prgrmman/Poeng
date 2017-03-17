package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/*
 * This class will serve to represent the loading screen in the beginning
 * This will just have an opening animation
 */
public class SplashScreen implements Screen {
// TODO: implement menu stuff
	final PoengGame game; // refers to the game instance
	Texture logo;
	SpriteBatch batch;
	OrthographicCamera camera;
	int screenWidth;
	int screenHeight;
	
	
	public SplashScreen(final PoengGame game){
		this.game = game;
		logo = new Texture(Gdx.files.internal("data/logo.gif"));
		camera = new OrthographicCamera();
		camera.setToOrtho(false, screenWidth, screenHeight);
		System.out.println(logo.getWidth());
		System.out.println(Gdx.graphics.getWidth());
	}
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(210/255f, 210/255f, 210/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		// game.batch.setProjectionMatrix(camera.combined);
		game.batch.enableBlending();
		game.batch.begin();
		game.batch.draw(logo, 0, 0);
		game.batch.end();
		
		// when finished with splash
		// game.setScreen(something here)
		
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
