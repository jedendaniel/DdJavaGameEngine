package dd.command;

import dd.player.GameObject;

public interface Command {

    void execute(GameObject gameObject);
}
