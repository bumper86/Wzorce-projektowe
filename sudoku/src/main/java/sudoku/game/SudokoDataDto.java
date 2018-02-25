package sudoku.game;

public class SudokoDataDto {
    private int value;
    private int x;
    private int y;

    public SudokoDataDto(int x, int y, int value) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "SudokoDataDto{" +
                "value=" + value +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
