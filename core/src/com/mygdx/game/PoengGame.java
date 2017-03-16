package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PoengGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private Music bgMusic;
	private OrthographicCamera camera;
	
	// This is a test of the ball
	private Ball ball;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		bgMusic = Gdx.audio.newMusic(Gdx.files.internal("data/bgm.ogg"));
		img = new Texture(Gdx.files.internal("data/cat.gif"));
		ball = new Ball(0,0);
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1250, 750);
		bgMusic.setLooping(true);
		bgMusic.play();

	}

	@Override
	public void render () {
		// Draw Backgound
		Gdx.gl.glClearColor(210/255f, 210/255f, 210/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// Draw sprite batch
		batch.begin();
		ball.draw(batch);
		ball.moveRight();
		batch.end();
		camera.update();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		bgMusic.dispose();
	}
}
