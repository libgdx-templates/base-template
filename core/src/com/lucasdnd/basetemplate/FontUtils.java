package com.lucasdnd.basetemplate;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Use these methods to easily draw text. Supports text alignment and drop shadow.
 * @author lucasdnd
 *
 */
public class FontUtils {
	
	private SpriteBatch fontBatch;
	private float shadowDistance = 1f;
	
	public FontUtils() {
		this.fontBatch = new SpriteBatch();
	}
	
	public int getTextWidth(String text) {
		float charWidth = Resources.get().blackFont.getSpaceWidth();
		float textWidth = charWidth * text.length();
		return (int)textWidth;
	}
	
	public void drawWhiteFont(String text, float x, float y, boolean withShadow) {
		fontBatch.begin();
		if (withShadow) {
			Resources.get().grayFont.draw(fontBatch, text, x + shadowDistance, y - shadowDistance);
		}
		Resources.get().whiteFont.draw(fontBatch, text, x, y);
		fontBatch.end();
	}
	
	public void drawWhiteFont(String text, float x, float y, boolean withShadow, int align, int space) {
		fontBatch.begin();
		if (withShadow) {
			Resources.get().grayFont.draw(fontBatch, text, x + shadowDistance, y - shadowDistance, space, align, false);
		}
		Resources.get().whiteFont.draw(fontBatch, text, x, y, space, align, false);
		fontBatch.end();
	}
	
	public void drawRedFont(String text, float x, float y, boolean withShadow, int align, int space) {
		fontBatch.begin();
		if (withShadow) {
			Resources.get().grayFont.draw(fontBatch, text, x + shadowDistance, y - shadowDistance, space, align, false);
		}
		Resources.get().redFont.draw(fontBatch, text, x, y, space, align, false);
		fontBatch.end();
	}
	
	public void drawGrayFont(String text, float x, float y, boolean withShadow, int align, int space) {
		fontBatch.begin();
		if (withShadow) {
			Resources.get().lightGrayFont.draw(fontBatch, text, x + shadowDistance, y - shadowDistance, space, align, false);
		}
		Resources.get().grayFont.draw(fontBatch, text, x, y, space, align, false);
		fontBatch.end();
	}

	public void drawGreenFont(String text, float x, float y, boolean withShadow, int align, int space) {
		fontBatch.begin();
		if (withShadow) {
			Resources.get().lightGrayFont.draw(fontBatch, text, x + shadowDistance, y - shadowDistance, space, align, false);
		}
		Resources.get().greenFont.draw(fontBatch, text, x, y, space, align, false);
		fontBatch.end();
	}

	public float getShadowDistance() {
		return shadowDistance;
	}

	public void setShadowDistance(float shadowDistance) {
		this.shadowDistance = shadowDistance;
	}
}
