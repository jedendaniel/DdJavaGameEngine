package dd.command;

import dd.player.GameObject;

public class MoveDownCommand implements Command{

    @Override
    public void execute(GameObject gameObject) {
        gameObject.move(0,-1);
    }
}
