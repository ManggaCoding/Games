package com.marimaridev.laridanlompat;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;

public class TitleScreen implements ApplicationListener{
	
	OrthographicCamera camera;
	
	@Override
	public void create(){
		// TODO: Implement this method
		camera = new OrthographicCamera();
		camera.setToOrtho(false,800,480);
	}

	@Override
	public void resize(int p1, int p2){
		// TODO: Implement this method
	}

	@Override
	public void render(){
		// TODO: Implement this method
		Gdx.gl.glClearColor(0.5f, 0.5f, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void pause(){
		// TODO: Implement this method
	}

	@Override
	public void resume(){
		// TODO: Implement this method
	}

	@Override
	public void dispose(){
		// TODO: Implement this method
	}

}
