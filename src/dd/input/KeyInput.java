package dd.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    InputHandler inputHandler;

    public KeyInput(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        inputHandler.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        inputHandler.keyReleased(e);
    }
}
