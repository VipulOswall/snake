package com.example.vipuloswal.snake.Impl;


import android.media.SoundPool;

import com.example.vipuloswal.snake.Framework.Sound;

public class MySound implements Sound {
    int soundId;
    SoundPool soundPool;
    public MySound(SoundPool soundPool, int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }
    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }
    public void dispose() {
        soundPool.unload(soundId);
    }
}
