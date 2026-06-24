package com.workshop.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.workshop.Main;

public class SplashScreen implements Screen {

    private Main game;
    private SpriteBatch batch;
    private Texture[] logos;
    private int currentLogoIndex = 0;
    private float timer = 0f;
    private final float SHOW_TIME = 2.0f;

    public  SplashScreen(Main game) {
        this.game = game;
        this.batch = new SpriteBatch();
        logos = new Texture[2];
        logos[0] = new Texture("logo.png");
        logos[1] = new Texture("logo.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0,0,0,1);
        timer += delta;

        if (timer > SHOW_TIME) {
            timer = 0f;
            currentLogoIndex++;
            if (currentLogoIndex >= logos.length) {
                game.setScreen(new MainMenuscreen(game));
                dispose();
                return;
            }
        }

        batch.begin();
        Texture currentLogo = logos[currentLogoIndex];

        float x = (Gdx.graphics.getWidth() - currentLogo.getWidth()) / 2f;
        float y = (Gdx.graphics.getHeight() - currentLogo.getHeight()) / 2f;

        batch.draw(currentLogo,x,y);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        for(Texture logo : logos) {
            logo.dispose();
        }
    }
}
