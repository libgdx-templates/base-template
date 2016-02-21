package com.lucasdnd.basetemplate;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Align;

public class BaseTemplate extends ApplicationAdapter {
	
	SpriteBatch batch;
	InputHandler input;
	FontUtils font;
	
	float x, y, speed;
	final float lineHeight = 32f;
	final float topMargin = 8f;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		input = new InputHandler();
		Gdx.input.setInputProcessor(input);
		font = new FontUtils();
		
		speed = 3f;
	}
	
	public void update() {
		
		// Movement
		if (input.upPressed) {
			y += speed;
		} else if (input.downPressed) {
			y -= speed;
		}
		
		if (input.rightPressed) {
			x += speed;
		} else if (input.leftPressed) {
			x -= speed;
		}
		
		// Action key
		input.actionDelay--;
		if (input.actionDelay <= 0) {
			input.actionDelay = 0;

			if (input.ePressed) {
				
				// Perform your action here
				Resources.get().miningSound.play();
				
				input.applyActionDelay();
			}
		}
	}

	@Override
	public void render () {
		
		// Run the update method before we draw stuff on the screen
		update();
		
		// Clear the screen (black)
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// Draw our sprite
		batch.begin();
		batch.draw(Resources.get().badlogic, x, y);
		batch.end();
		
		// Draw text
		font.drawWhiteFont("Use arrow keys to move", 0f, Gdx.graphics.getHeight() - topMargin, true, Align.center, Gdx.graphics.getWidth());
		font.drawWhiteFont("Press 'E' to perform action", 0f, Gdx.graphics.getHeight() - topMargin - lineHeight, true, Align.center, Gdx.graphics.getWidth());
		font.drawWhiteFont("Controller is also supported", 0f, Gdx.graphics.getHeight() - topMargin - lineHeight * 2, true, Align.center, Gdx.graphics.getWidth());
	}
}
