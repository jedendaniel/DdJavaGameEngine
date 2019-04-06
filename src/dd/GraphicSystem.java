package dd;

import dd.player.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GraphicSystem extends JFrame implements Runnable {

    List<GameObject> gameObjects;

    public GraphicSystem(List<GameObject> gameObjects) throws HeadlessException {
        super("GameGraphicSystem");
        this.gameObjects = gameObjects;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 400);
        Timer timer = new Timer(20, arg0 -> GraphicSystem.this.repaint());
        timer.start();
    }

    @Override
    public synchronized void paint(Graphics g){
        refresh(g);
        gameObjects.forEach(gameObject -> gameObject.draw(g));
    }

    @Override
    public void run() {
    }

    private void refresh(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
