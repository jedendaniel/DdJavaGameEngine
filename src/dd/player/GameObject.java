package dd.player;

import dd.utility.Vector2;

import java.awt.*;

public class GameObject {
    private Vector2 position;
    private Vector2 size;

    public GameObject() {
        position = new Vector2(0,0);
        size = new Vector2(0,0);
    }

    public GameObject(Vector2 position, Vector2 size) {
        this.position = position;
        this.size = size;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getSize() {
        return size;
    }

    public void update(){
        move(1,1);
    }

    public void move(int x, int y){
        position.move(x,y);
    }

    public void draw(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D)graphics;
        Vector2 position = getPosition();
        Vector2 size = getSize();
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawRect(position.x, position.y, size.x, size.y);
    }
}
