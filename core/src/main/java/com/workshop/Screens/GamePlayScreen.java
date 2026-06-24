package com.workshop.Screens;

import com.badlogic.gdx.Screen;
import com.workshop.model.Knight;
import com.workshop.Main;

public class GamePlayScreen implements Screen {

    private Main game;
    private int saveSlotNumber;
    private Knight knight;

    public GamePlayScreen(Main game, int saveSlotNumber, boolean isNewGame) {

        this.game = game;
        this.saveSlotNumber = saveSlotNumber;

        if (isNewGame){
            startFreshGame();
        }else {
            loadGameData(saveSlotNumber);
        }
    }
    private void startFreshGame() {

    }

    private void loadGameData(int slot) {

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

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

    }
}
