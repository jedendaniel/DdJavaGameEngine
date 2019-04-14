package dd;

import dd.display.DisplaySystem;
import dd.input.InputHandler;
import dd.physic.PhysicEngine;

import java.awt.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Game extends Component{

    static final double MS_PER_FRAME = 1000 / 60;

    DisplaySystem displaySystem;
    PhysicEngine physicEngine;
    InputHandler inputHandler;

    public Game(DisplaySystem displaySystem, PhysicEngine physicEngine, InputHandler inputHandler) {
        this.displaySystem = displaySystem;
        this.physicEngine = physicEngine;
        this.inputHandler = inputHandler;
        addKeyListener(inputHandler.getKeyInput());
    }

    public void run() throws InterruptedException {
        while (true){
            double start = getCurrentTime();
            displaySystem.render();
            physicEngine.update();
            double sleepTime = MS_PER_FRAME - (getCurrentTime() - start);
            System.out.println(1000 / sleepTime);
            if (sleepTime > 0) TimeUnit.MILLISECONDS.sleep((long)sleepTime);
        }
    }

    private long getCurrentTime(){
        return new Date().getTime();
    }

    private void
}
