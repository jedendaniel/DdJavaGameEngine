package dd.physic;

import dd.player.GameObject;

import java.util.List;

public class PlatformerPhysicEngine implements PhysicEngine{

    List<GameObject> gameObjects;

    public PlatformerPhysicEngine(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    @Override
    public void update() {
        gameObjects.stream().forEach(GameObject::update);
    }
}
