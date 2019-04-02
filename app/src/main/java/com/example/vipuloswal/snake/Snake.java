package com.example.vipuloswal.snake;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vipul Oswal on 21-08-2017.
 */

public class Snake {
    public static final int UP = 0;
    public static final int LEFT = 1;
    public static final int DOWN = 2;
    public static final int RIGHT = 3;
    public List< Snakepart > parts = new ArrayList< Snakepart >();
    public int direction;
    public Snake() {
        direction = UP;
        parts.add(new Snakepart(5, 6));
        parts.add(new Snakepart(5, 7));
        parts.add(new Snakepart(5, 8));
    }
    public void turnLeft() {
        direction += 1;
        if(direction > RIGHT)
            direction = UP;
    }
    public void turnRight() {
        direction -= 1;
        if(direction < UP)
            direction = RIGHT;
    }
    public void eat() {
        Snakepart end = parts.get(parts.size()-1);
        parts.add(new Snakepart(end.x, end.y));
    }
    public void advance() {
        Snakepart head = parts.get(0);
        int len = parts.size() - 1;
        for(int i = len; i > 0; i--) {
            Snakepart before = parts.get(i-1);
            Snakepart part = parts.get(i);
            part.x = before.x;
            part.y = before.y;
        }
        if(direction == UP)
            head.y -= 1;
        if(direction == LEFT)
            head.x -= 1;
        if(direction == DOWN)
            head.y += 1;
        if(direction == RIGHT)
            head.x += 1;
        if(head.x < 0)
            head.x = 9;
        if(head.x > 9)
            head.x = 0;
        if(head.y < 0)
            head.y = 12;
        if(head.y > 12)
            head.y = 0;
    }
    public boolean checkBitten() {
        int len = parts.size();
        Snakepart head = parts.get(0);
        for(int i = 1; i < len; i++) {
            Snakepart part = parts.get(i);
            if(part.x == head.x && part.y == head.y)
                return true;
        }
        return false;
    }
}