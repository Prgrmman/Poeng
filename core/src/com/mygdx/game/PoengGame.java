package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PoengGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Music music; 
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		System.out.println("Hello World\n");
		music = Gdx.audio.newMusic(Gdx.files.internal("data/bgm.ogg"));
		music.play();
	}

	@Override
	public void render () {
		// Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClearColor(210/255f, 210/255f, 210/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		music.dispose();
	}
}
