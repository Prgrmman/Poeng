package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PoengGame extends Game {
	SpriteBatch batch;
	
	// This is a test of the ball

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		// probably not a good idea to start music here
		// poop
		this.setScreen((new SplashScreen(this)));

	}

	@Override
	public void render () {
		super.render();
	}
	
	// game loop
	public void loop(){
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
