package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/*
 * This class represents the ball object that will be present during the game
 */
public class Ball {
	/*
	 * Fields
	 */
	// coordinates
	private float x;
	private float y;

	// ball image
	private Texture image;
	
	/*
	 * Constructors
	 */
	public Ball(){
		image = new Texture(Gdx.files.internal("data/cat.gif"));

	}
	
	public Ball(float x, float y){
		this(); // call default constructor
		this.x = x;
		this.y = y;
	}
	/*
	 * access and set
	 */
	public float getX(){return x;}
	public float getY(){return y;}
	
	// probably shouldn't use these one constructed
	public void setX(float x){this.x = x;}
	public void setY(float y){this.y = y;}
	
	
	/*
	 * User methods
	 */
	public void moveRight(){
		x += 1;
	}
	public void moveLeft(){
		x -= 1;
	}
	
	public void draw(SpriteBatch batch){
		batch.draw(image, x, y);
	}
}
