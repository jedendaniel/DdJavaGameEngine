package dd.utility;

public class Vector2 {
    public int x;
    public int y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 move(int x, int y){
        this.x += x;
        this.y += y;
        return this;
    }

    public Vector2 move(Vector2 offset){
        x += offset.x;
        y += offset.y;
        return this;
    }
}
