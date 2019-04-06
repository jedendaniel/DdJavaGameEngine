package dd.input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter {

    InputHandler inputHandler;

    public MouseInput(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        inputHandler.mouseClicked(e);
    }
}
