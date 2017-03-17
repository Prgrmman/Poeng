package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PoengGame extends Game {
	SpriteBatch batch;
	Music bgMusic;
	
	// This is a test of the ball

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		bgMusic = Gdx.audio.newMusic(Gdx.files.internal("data/bgm.ogg"));

		bgMusic.setLooping(true);
		bgMusic.play();
		
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
		bgMusic.dispose();
	}
}
