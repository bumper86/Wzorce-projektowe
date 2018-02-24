package sudoku.game;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> sudokuFields = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i <9; i++){
            sudokuFields.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getSudokuFields() {
        return sudokuFields;
    }
}
