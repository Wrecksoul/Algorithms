package com.coding.algorithm.leetcode;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Position> obstacleSet = Stream.of(obstacles).map(arr -> new Position(arr[0], arr[1])).collect(Collectors.toSet());
        Robot robot = new Robot(0, 0, Direct.UP, obstacleSet);
        for (int command : commands) {
            robot.act(command);
        }
        return robot.getMaxDistance();
    }
}

class Robot {
    private Direct direct;

    private Position position;

    private Set<Position> obstacleSet;

    private int maxDistance;


    Robot(int x, int y, Direct direct, Set<Position> obstacles) {
        this.direct = direct;
        this.position = new Position(x, y);
        this.obstacleSet = obstacles;

    }

    void act(int command) {
        if (command == -2) {
            this.direct = Direct.leftTurn(this.direct);
        } else if (command == -1) {
            this.direct = Direct.rightTurn(this.direct);
        } else if (command >= 1 && command <= 9) {
            move(command);
            int euclideanDistance = position.euclideanDistance();
            maxDistance = maxDistance > euclideanDistance ? maxDistance : euclideanDistance;
        }
    }

    private void move(int command) {

        int i = 0;
        while (i < command) {
            Position newPosition = position.changeOneStep(direct);
            if (isStuck(newPosition)) {
                break;
            }
            position = newPosition;
            i++;
        }
    }

    private boolean isStuck(Position newPosition) {
        return this.obstacleSet.contains(newPosition);
    }


    int getMaxDistance() {
        return maxDistance;
    }
}

class Position {
    private int x;
    private int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Position changeOneStep(Direct direct) {
        return new Position(x + direct.getHorizontalMove(), y + direct.getVerticalMove());
    }

    int euclideanDistance() {
        return x * x + y * y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += result * 31 + x;
        result += result * 31 + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position other = (Position) obj;
        return x == other.x && other.y == y;
    }
}

enum Direct {
    UP(0, 0, 1), RIGHT(1, 1, 0), DOWN(2, 0, -1), LEFT(3, -1, 0),;

    private int val;
    private int horizontalMove;
    private int verticalMove;

    Direct(int val, int horizontalMove, int verticalMove) {
        this.val = val;
        this.verticalMove = verticalMove;
        this.horizontalMove = horizontalMove;
    }

    private static Direct from(int val) {
        return Stream.of(Direct.values()).filter(x -> x.val == val).findAny().orElseThrow(() -> new RuntimeException("方向获取不到"));
    }

    static Direct leftTurn(Direct direct) {
        int newVal = (direct.val + 3) % 4;
        return from(newVal);
    }

    static Direct rightTurn(Direct direct) {
        int newVal = (direct.val + 1) % 4;
        return from(newVal);
    }

    public int getHorizontalMove() {
        return horizontalMove;
    }

    public int getVerticalMove() {
        return verticalMove;
    }
}

