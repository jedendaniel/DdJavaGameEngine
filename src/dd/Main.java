package dd;

import dd.input.InputHandler;
import dd.input.KeyInput;
import dd.player.GameObject;
import dd.utility.Vector2;

import java.util.ArrayList;

import static sun.misc.PostVMInitHook.run;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<GameObject> gameObjects = new ArrayList(){{
            add(new GameObject(new Vector2(0,0), new Vector2(10,10)));
        }};
        new Game(new GraphicSystem(gameObjects), new PhysicEngine(gameObjects),
            new InputHandler(gameObjects.get(0))).run();
    }
}
