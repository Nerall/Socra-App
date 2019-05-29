package com.epita.socra.app;

import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public void run(){
        String number = "";
        while (!number.equals("exit"))
        {
            adapter.write("Give a number (write 'exit' to exit)");
            number = adapter.read();
            adapter.write("Here is its morse representation\n" + Morse.toMorse(number));
        }
    }
}
