package com.example.vipuloswal.snake;

import com.example.vipuloswal.snake.Framework.Screen;
import com.example.vipuloswal.snake.Impl.MyGame;

public class SnakeGame extends MyGame {
    public Screen getStartScreen() {
        return new Loading(this);
    }
}
