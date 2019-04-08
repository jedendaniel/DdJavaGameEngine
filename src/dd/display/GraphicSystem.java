package dd.display;

import dd.player.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.List;

public class GraphicSystem extends Canvas implements DisplaySystem{

    List<GameObject> gameObjects;
    JFrame frame;

    public GraphicSystem(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
        frame = new JFrame("GameGraphicSystem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 400);
        frame.add(this);
    }

    @Override
    public void render(){
        BufferStrategy bufferStrategy = getBufferStrategy();
        if(bufferStrategy == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics graphics = bufferStrategy.getDrawGraphics();
        refresh(graphics);
        gameObjects.forEach(gameObject -> gameObject.draw(graphics));
        graphics.dispose();
        bufferStrategy.show();
    }

    private void refresh(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, frame.getWidth(), frame.getHeight());
    }
}
