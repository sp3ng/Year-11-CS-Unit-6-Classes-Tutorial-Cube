public class Cube {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public Cube() {
        this.side = 1;
    }

    public Cube(int s) {
        side = s;
        if (s < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public int getSurfaceArea() {
        return side * side * 6;
    }

    public int getVolume() {
        return side * side * side;
    }
}
