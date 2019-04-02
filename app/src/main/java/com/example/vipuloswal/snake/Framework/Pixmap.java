package com.example.vipuloswal.snake.Framework;

import com.example.vipuloswal.snake.Framework.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();
    public int getHeight();
    public PixmapFormat getFormat();
    public void dispose();
}