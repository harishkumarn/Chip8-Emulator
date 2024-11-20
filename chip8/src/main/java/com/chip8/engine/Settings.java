package com.chip8.engine;

import java.awt.Color;

public class Settings {
    public static final String ROM_PATH = "E:\\GIT\\Chip8-Emulator\\ROMS\\Pong.ch8";
    public static final Color SET_COLOR = Color.GREEN;
    public static final boolean DISASSEMBLE_ASM = false;

    //16.666666 ms delay equates to 60 cycles / minutes. Chip8's CPU speed is 60 Hz.
    public static final int CYCLE_DURATION = 16;// in ms
}
