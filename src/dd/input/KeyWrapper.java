package dd.input;

import dd.command.Command;
import javafx.scene.input.KeyCode;

public class KeyWrapper {

    KeyCode keyCode;
    Command command;
    boolean pressed = false;
    boolean released = false;

    public KeyWrapper(KeyCode keyCode, Command command) {
        this.keyCode = keyCode;
        this.command = command;
    }

    public void setKeyCode(KeyCode keyCode) {
        this.keyCode = keyCode;
    }

    public boolean isPressed() {
        return pressed;
    }

    public void setPressed(boolean pressed) {
        this.pressed = pressed;
    }

    public boolean isReleased() {
        return released;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public Command getCommand() {
        return command;
    }
}
