package sudoku.game;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public final static int SUDOKU_AXIS_LENGHT = 9;
    public final static int SUDOKU_BEGIN_LENGHT = 0;

    private List<SudokuRow> sudokuRows = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuRows.add(new SudokuRow());
        }
    }

    public SudokuElement getSudokuElement(int x, int y) {
        return sudokuRows.get(y).getSudokuFields().get(x);
    }

    public List<SudokuRow> getSudokuRows() {
        return sudokuRows;
    }

    @Override
    public String toString() {
        String result ="";
        result += drwaLine();
        result +="\n";
        for (int n = SUDOKU_BEGIN_LENGHT; n < SUDOKU_AXIS_LENGHT; n++) {
            result +="| ";

            for (int m = SUDOKU_BEGIN_LENGHT; m < SUDOKU_AXIS_LENGHT; m++) {
                int field = sudokuRows.get(n).getSudokuFields().get(m).getValue();
                if (field == 0) {
                    result += " ";
                } else {
                    result += field;
               //     result += " | ";
                }
                result += " | ";
            }
            result += "\n" + drwaLine();
            result += "\n";

        }
        return result;
    }

    private static String drwaLine() {
        String line = "-";
        for (int i = 0; i < 36; i++) {
            line = line + "-";
        }
        return line;
    }
}
