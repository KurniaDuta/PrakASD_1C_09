package P2.dragonGames;

public class dragon {
    int x, y, width, height;

    public dragon() {
    }

    public dragon(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        if (y < height) {
            y++;
        } else {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.printf("x = %d, y = %d", x, y);
    }

    void detectCollision(int x, int y) {
        if (x < 0 || x == width || y < 0 || y == height) {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }
}
