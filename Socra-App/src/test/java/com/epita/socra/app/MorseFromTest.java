package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

public class MorseFromTest {

    @Test
    public void checkMorseFromFrom0_to_9() {
        assertEquals("0", Morse.fromMorse("_ _ _ _ _"));
        assertEquals("1", Morse.fromMorse(". _ _ _ _"));
        assertEquals("2", Morse.fromMorse(". . _ _ _"));
        assertEquals("3", Morse.fromMorse(". . . _ _"));
        assertEquals("4", Morse.fromMorse(". . . . _"));
        assertEquals("5", Morse.fromMorse(". . . . ."));
        assertEquals("6", Morse.fromMorse("_ . . . ."));
        assertEquals("7", Morse.fromMorse("_ _ . . ."));
        assertEquals("8", Morse.fromMorse("_ _ _ . ."));
        assertEquals("9", Morse.fromMorse("_ _ _ _ ."));
    }

    @Test
    public void checkMorseTo10() {
        assertEquals("10", Morse.fromMorse(". _ _ _ _ _ _ _ _ _"));
    }

    @Test
    public void checkMorseTo42() {
        assertEquals("42", Morse.fromMorse(". . . . _ . . _ _ _"));
    }

    @Test
    public void checkMorseTo83() {
        assertEquals("83", Morse.fromMorse("_ _ _ . . . . . _ _"));
    }

    @Test
    public void checkMorseTo999() {
        assertEquals("999", Morse.fromMorse("_ _ _ _ . _ _ _ _ . _ _ _ _ ."));
    }

    @Test
    public void checkMorseTo1903(){
        assertEquals("1903", Morse.fromMorse(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _"));
    }
}
