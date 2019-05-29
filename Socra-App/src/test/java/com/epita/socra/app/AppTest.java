package com.epita.socra.app;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

public class AppTest {
    @Test
    public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        App app = new App(mock);
        app.run();

        verify(mock).write("10");
        verify(mock).write(argThat(message -> message.contains(". _ _ _ _ _ _ _ _ _")));
    }
}
