package dd.input;

import dd.command.Command;
import dd.command.MoveDownCommand;
import dd.command.MoveUpCommand;
import dd.player.GameObject;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InputHandler {

    KeyInput keyInput;
    MouseInput mouseInput;
    GameObject gameObject;
    Map<String, KeyWrapper> keysMapping = new HashMap<>();

    public InputHandler(GameObject gameObject) {
        this.keyInput = new KeyInput(this);
        this.gameObject = gameObject;
        loadKeysMapping(new HashMap<String, KeyWrapper>(){{
            put("MoveUp", new KeyWrapper(KeyCode.UP, new MoveUpCommand()));
            put("MoveDown", new KeyWrapper(KeyCode.UP, new MoveDownCommand()));
        }});
    }

    public InputHandler(KeyInput keyInput, MouseInput mouseInput) {
        this.keyInput = keyInput;
        this.mouseInput = mouseInput;
    }

    public KeyInput getKeyInput() {
        return keyInput;
    }

    public MouseInput getMouseInput() {
        return mouseInput;
    }

    public void loadKeysMapping(Map<String, KeyWrapper> keysMapping){
        this.keysMapping = keysMapping;
    }

    public void setKeyMapping(String commandName, KeyCode keyCode){
        this.keysMapping.get(commandName).setKeyCode(keyCode);
    }

    public void executeCommands(){
        keysMapping.values().stream().
                filter(KeyWrapper::isPressed).map(KeyWrapper::getCommand).collect(Collectors.toList()).
                forEach(command -> command.execute(gameObject));
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }


}
