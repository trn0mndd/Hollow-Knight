package com.workshop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.workshop.Screens.MainMenuscreen;
import com.workshop.Screens.SplashScreen;
import com.workshop.controller.KnightController;
import com.workshop.model.Knight;
import com.workshop.view.GameRender;

public class Main extends Game {
    private Knight knight;
    private KnightController controller;
    private GameRender renderer;

    @Override
    public void create() {
        this.setScreen(new SplashScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
