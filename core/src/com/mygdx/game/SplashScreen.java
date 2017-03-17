package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.TimeUtils;

/*
 * This class will serve to represent the loading screen in the beginning
 * This will just have an opening animation
 */
public class SplashScreen implements Screen {
	// Fields
	final PoengGame game; // refers to the game instance
	Texture logo;
	SpriteBatch batch;
	OrthographicCamera camera;
	Music splashMusic;
	int screenWidth;
	int screenHeight;
	float alphaLevel; // controls transparency of splash screen
	long startTime;
	boolean finished; // when the splash screen is done
	
	
	public SplashScreen(final PoengGame game){
		this.game = game;
		screenWidth = 1600;
		screenHeight = 900;
		alphaLevel = 0.0f;
		logo = new Texture(Gdx.files.internal("data/logo.gif"));
		camera = new OrthographicCamera();
		camera.setToOrtho(false, screenWidth, screenHeight);
		// This should probably be a different file
		splashMusic = Gdx.audio.newMusic(Gdx.files.internal("data/bgm.ogg"));
		splashMusic.setLooping(true);
		splashMusic.play();
		startTime = TimeUtils.millis();
		finished = false;
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
		game.batch.setColor(1.0f, 1.0f, 1.0f, alphaLevel);
		game.batch.begin();
		game.batch.draw(logo, 40, 0);
		game.batch.end();
		if (Math.abs(alphaLevel -1) >=  0.01)
			alphaLevel += 0.01;
		
		// when finished with splash
		// game.setScreen(something here)

		// wait for 4 seconds
		if (!finished){
			long elapsed = TimeUtils.millis() - startTime;
			if (elapsed > 4000){
				System.out.println("boop");
				finished = true;
			}
		}
		
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
		logo.dispose();
		
	}
}
