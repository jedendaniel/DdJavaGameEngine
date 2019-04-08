package dd;

import dd.display.DisplaySystem;
import dd.input.InputHandler;
import dd.physic.PhysicEngine;

import java.awt.*;

public class Game extends Component{

    DisplaySystem displaySystem;
    PhysicEngine physicEngine;
    InputHandler inputHandler;

    public Game(DisplaySystem displaySystem, PhysicEngine physicEngine, InputHandler inputHandler) {
        this.displaySystem = displaySystem;
        this.physicEngine = physicEngine;
        this.inputHandler = inputHandler;
        addKeyListener(inputHandler.getKeyInput());
    }

    public void run(){
        while (true){
            displaySystem.render();
            physicEngine.update();
            // TODO: not so fast BOI
        }
    }
}
