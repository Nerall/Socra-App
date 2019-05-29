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
        String input;
        do {
            adapter.write("Give an input (write 'exit' to exit):");
            input = adapter.read();
            if (input.equals("exit")) {
                break;
            }
            else if (input.charAt(0) == '.' || input.charAt(0) == '_') {
                adapter.write("Here is the Arabic representation:\n" + Morse.fromMorse(input) + "\n");
            }
            else {
                adapter.write("Here is its morse representation:\n" + Morse.toMorse(input) + "\n");
            }
        } while (true);
    }
}
