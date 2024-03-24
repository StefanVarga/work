package logic;

import java.awt.*;
import java.util.ArrayList;

public class Wall {
    Coordinates start;
    Coordinates stop;
    Color color;

    public Wall(int x1, int y1, int x2, int y2, Color color) {
        this.start = new Coordinates(x1, y1);
        this.stop = new Coordinates(x2,y2);
        this.color = color;
    }

    public Coordinates getStart() {
        return start;
    }

    public Coordinates getStop() {
        return stop;
    }

    public Color getColor() {
        return color;
    }

    public Rectangle getWallRectangle() { return new Rectangle(this.start.x, this.start.y, this.stop.x, this.stop.y); }
}
