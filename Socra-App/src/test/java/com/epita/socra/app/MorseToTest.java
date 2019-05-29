package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

public class MorseToTest {

    @Test
    public void checkMorseToFrom0_to_9() {
        assertEquals("_ _ _ _ _", Morse.toMorse("0"));
        assertEquals(". _ _ _ _", Morse.toMorse("1"));
        assertEquals(". . _ _ _", Morse.toMorse("2"));
        assertEquals(". . . _ _", Morse.toMorse("3"));
        assertEquals(". . . . _", Morse.toMorse("4"));
        assertEquals(". . . . .", Morse.toMorse("5"));
        assertEquals("_ . . . .", Morse.toMorse("6"));
        assertEquals("_ _ . . .", Morse.toMorse("7"));
        assertEquals("_ _ _ . .", Morse.toMorse("8"));
        assertEquals("_ _ _ _ .", Morse.toMorse("9"));
    }

    @Test
    public void checkMorseTo10() {
        assertEquals(". _ _ _ _ _ _ _ _ _", Morse.toMorse("10"));
    }

    @Test
    public void checkMorseTo42() {
        assertEquals(". . . . _ . . _ _ _", Morse.toMorse("42"));
    }

    @Test
    public void checkMorseTo83() {
        assertEquals("_ _ _ . . . . . _ _", Morse.toMorse("83"));
    }

    @Test
    public void checkMorseTo999() {
        assertEquals("_ _ _ _ . _ _ _ _ . _ _ _ _ .", Morse.toMorse("999"));
    }

    @Test
    public void checkMorseTo1903(){
        assertEquals(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _", Morse.toMorse("1903"));
    }
}
