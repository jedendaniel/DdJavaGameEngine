package dd;

import dd.input.InputHandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Game {

    Runnable graphicSystem;
    PhysicEngine physicEngine;
    InputHandler inputHandler;

    public Game(GraphicSystem graphicSystem, PhysicEngine physicEngine, InputHandler inputHandler)
            throws InterruptedException {
        this.graphicSystem = graphicSystem;
        this.physicEngine = physicEngine;
        this.inputHandler = inputHandler;
        graphicSystem.addKeyListener(inputHandler.getKeyInput());
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(graphicSystem);
        service.submit(physicEngine);
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
        System.exit(0);
    }

    public void run(){
        while (true){
            inputHandler
        }
    }
}
