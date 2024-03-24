import logic.Ball;
import logic.Direction;
import logic.Wall;

import java.awt.*;
import java.util.ArrayList;

public class GameLogic {
    private Ball ball;
    private Ball ballEnemy;
    private ArrayList<Wall> walls;
    private Wall wall1;

    public GameLogic() {
        this.ball = null;
        this.ballEnemy = null;
        this.walls = new ArrayList<>();
    }

    public void initialize() {
        ball = new Ball(20, 20, 50, 50, Color.BLUE);
        ballEnemy = new Ball(250, 20, 70, 70, Color.RED);
        wall1 = new Wall(400, 20, 400, 70, Color.BLACK);
        walls.add(wall1);

    }

    public void update() {
        if (ball.isCollided(ballEnemy.getBallRectangle())) {
            ballEnemy.inactive();
        }
        for(Wall wall: walls) {
            if(wall != null) {
                if(ball.isCollided(wall.getWallRectangle())) {
                    wall1 = null;
                }
            }
        }
        ball.move(2, Direction.RIGHT);
    }

    public Ball getBall() {
        return ball;
    }

    public Ball getBallEnemy() {
        return ballEnemy;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }

    public Wall getWall1() {
        return wall1;
    }
}
