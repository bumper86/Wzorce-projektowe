package sudoku.game;

import java.util.HashSet;
import java.util.Set;

public class SudokuElement {
    private int value;
    private Set<Integer> allowedValue = new HashSet<>();

    public SudokuElement() {
        for (int i = 1; i<10; i++) {
            allowedValue.add(i);
        }
    }

    public void setValue(int value) {
        if (value >= 0 && value <=9) {
            this.value = value;
            allowedValue.clear();
            allowedValue.add(value);
        }
    }

    public int getValue() {
        return value;
    }

    public void removeAllowedValue(int value) {
        allowedValue.remove(value);
    }
}
