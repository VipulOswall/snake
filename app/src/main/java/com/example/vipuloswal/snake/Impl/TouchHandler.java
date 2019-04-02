package com.example.vipuloswal.snake.Impl;

import java.util.List;
import android.view.View.OnTouchListener;
import com.example.vipuloswal.snake.Framework.Input.TouchEvent;
public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);
    public int getTouchX(int pointer);
    public int getTouchY(int pointer);
    public List <TouchEvent> getTouchEvents();
}