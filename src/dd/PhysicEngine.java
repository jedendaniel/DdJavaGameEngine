package dd;

import dd.player.GameObject;

import java.util.List;

public class PhysicEngine implements Runnable {

    List<GameObject> gameObjects;

    public PhysicEngine(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    @Override
    public void run() {
        new Thread(this, "GamePhysicEngine");
        while(true){
            gameObjects.stream().forEach(GameObject::update);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
}
