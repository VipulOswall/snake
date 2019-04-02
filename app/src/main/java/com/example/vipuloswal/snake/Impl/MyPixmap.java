package com.example.vipuloswal.snake.Impl;

import android.graphics.Bitmap;
import com.example.vipuloswal.snake.Framework.Graphics.PixmapFormat;
import com.example.vipuloswal.snake.Framework.Pixmap;
public class MyPixmap implements Pixmap {
    Bitmap bitmap;
    PixmapFormat format;
    public MyPixmap(Bitmap bitmap, PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }
    public int getWidth() {
        return bitmap.getWidth();
    }
    public int getHeight() {
        return bitmap.getHeight();
    }
    public PixmapFormat getFormat() {
        return format;
    }
    public void dispose() {
        bitmap.recycle();
    }
}
