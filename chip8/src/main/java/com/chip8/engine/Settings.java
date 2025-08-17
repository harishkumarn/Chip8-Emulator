package com.chip8.engine;

import java.awt.Color;

public class Settings {
    public static final String ROM_PATH = "E:\\Git Repos\\Chip8-Emulator\\ROMS\\Pong.ch8";
    public static final Color SET_COLOR = Color.GREEN;
    public static final boolean DISASSEMBLE_ASM = true;

    //16.666666 ms delay equates to 60 cycles / second. Chip8's refresh rate is 60 Hz, CPU did 500 EPS.
    public static final int CYCLE_DURATION = 16;// in ms
}
