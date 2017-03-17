package com.mygdx.game;

import java.sql.Time;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.TimeUtils;

/*
 * This class will serve to represent the loading screen in the beginning
 * This will just have an opening animation
 */
public class SplashScreen implements Screen {
	// Fields
	final PoengGame game; // refers to the game instance
	Texture logo;
	float logoX;
	float logoY;
	OrthographicCamera camera;
	Music splashMusic;
	int screenWidth;
	int screenHeight;
	float alphaLevel; // controls transparency of splash screen
	long startTime;
	boolean doneFadeIn; // when the splash screen has faded in
	boolean doneFadeOut; // when the splash screen has faded out 
	
	
	public SplashScreen(final PoengGame game){
		this.game = game;
		screenWidth = 1600;
		screenHeight = 900;
		alphaLevel = 0.0f;
		
		// set up splash logo
		logo = new Texture(Gdx.files.internal("data/logo.gif"));
		logoX = screenWidth /2 - logo.getWidth() / 2;
		logoY = screenHeight / 2 - logo.getHeight() /2;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, screenWidth, screenHeight);
		// This should probably be a different file
		splashMusic = Gdx.audio.newMusic(Gdx.files.internal("data/meow.wav"));
		startTime = TimeUtils.millis();
		doneFadeIn = false;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	}


	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		game.batch.setProjectionMatrix(camera.combined);
		game.batch.enableBlending();
		game.batch.setColor(1.0f, 1.0f, 1.0f, alphaLevel);
		game.batch.begin();
		game.batch.draw(logo, logoX, logoY);
		game.batch.end();
		
		if (!doneFadeIn){
			fadeInLogo();
		}
		else if (doneFadeIn && !doneFadeOut){
			fadeOutLogo();
		}
		else{
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			dispose();
			game.setScreen(new MenuScreen(game));
		}
		// when doneFadeIn with splash
	
	}
	// causes logo to appear slowly
	private void fadeInLogo(){
		// wait for 4 seconds
		if (Math.abs(alphaLevel -1) >=  0.01)
			alphaLevel += 0.01;
		long elapsed = TimeUtils.millis() - startTime;
		if (Math.abs(elapsed - 1500) <= 50)
			splashMusic.play();
		if (elapsed > 4000){
			doneFadeIn = true;
			startTime = TimeUtils.millis(); // reset timer
		}
	}
	
	//causes logo to fade out slowly
	private void fadeOutLogo(){
		if (Math.abs(alphaLevel) >= 0.01 )
			alphaLevel -= 0.01;
		long elapsed = TimeUtils.millis() - startTime;
		if (elapsed > 3000){
			doneFadeOut = true;
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
		splashMusic.dispose();
		
	}
}
