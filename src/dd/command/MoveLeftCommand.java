package dd.command;

import dd.player.GameObject;

public class MoveLeftCommand implements Command{

    @Override
    public void execute(GameObject gameObject) {
        gameObject.move(-1,0);
    }
}
