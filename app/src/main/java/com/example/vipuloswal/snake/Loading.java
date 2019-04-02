package com.example.vipuloswal.snake;

import com.example.vipuloswal.snake.Framework.Game;
import com.example.vipuloswal.snake.Framework.Screen;
import com.example.vipuloswal.snake.Framework.Graphics.PixmapFormat;
import com.example.vipuloswal.snake.Framework.Graphics;

public class Loading extends Screen {

    public Loading(Game game) {
        super(game);
    }

    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("bac.png", PixmapFormat.RGB565);
        Assets.logo = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
        Assets.mainMenu = g.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
        Assets.buttons = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
        Assets.help1 = g.newPixmap("help.png", PixmapFormat.ARGB4444);
        Assets.help2 = g.newPixmap("help.png", PixmapFormat.ARGB4444);
        Assets.help3 = g.newPixmap("help.png", PixmapFormat.ARGB4444);
        Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
        Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
        Assets.pause = g.newPixmap("pause.png", PixmapFormat.ARGB4444);
        Assets.gameOver = g.newPixmap("gameover.png", PixmapFormat.ARGB4444);
        Assets.headUp = g.newPixmap("head.png", PixmapFormat.ARGB4444);
        Assets.headLeft = g.newPixmap("head.png", PixmapFormat.ARGB4444);
        Assets.headDown = g.newPixmap("head.png", PixmapFormat.ARGB4444);
        Assets.headRight = g.newPixmap("head.png", PixmapFormat.ARGB4444);
        Assets.tail = g.newPixmap("tail.png", PixmapFormat.ARGB4444);
        Assets.stain1 = g.newPixmap("stain.png", PixmapFormat.ARGB4444);
        Assets.stain2 = g.newPixmap("stain.png", PixmapFormat.ARGB4444);
        Assets.stain3 = g.newPixmap("stain.png", PixmapFormat.ARGB4444);
        Assets.click = game.getAudio().newSound("click.ogg");
        Assets.eat = game.getAudio().newSound("eat.ogg");
        Assets.bitten = game.getAudio().newSound("bitten.ogg");
        Settings.load(game.getFileIO());
        game.setScreen(new MainMenuScreen(game));
    }

    @Override
    public void present(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
