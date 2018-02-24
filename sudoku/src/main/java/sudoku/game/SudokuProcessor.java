package sudoku.game;

public class SudokuProcessor {

    private SudokuBoard sudokuBoard;

    public SudokuProcessor(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
        solve(0, 0);
        display();
    }

    private boolean solve(int i, int j) {
        if (i == 9) {
            i = 0;
            if (++j == 9){
                j=0;

            return true;}
        }
        if (sudokuBoard.getSudokuRows().get(i).getSudokuFields().get(j).getValue() != 0)  // skip filled cells
            return solve(i + 1, j);

        for (int val = 1; val <= 9; ++val) {
            if (legal(i, j, val)) {
                sudokuBoard.getSudokuRows().get(i).getSudokuFields().get(j).setValue(val);
                if (solve(i + 1, j))
                    return true;
            }
        }
        sudokuBoard.getSudokuRows().get(i).getSudokuFields().get(j).setValue(0);
        return false;
    }

    private boolean legal(int i, int j, int val) {
        for (int k = 0; k < 9; ++k)  // row
            if (val == sudokuBoard.getSudokuRows().get(k).getSudokuFields().get(j).getValue())
                return false;

        for (int k = 0; k < 9; ++k) // col
            if (val == sudokuBoard.getSudokuRows().get(i).getSudokuFields().get(k).getValue())
                return false;

        int boxRowOffset = (i / 3) * 3;
        int boxColOffset = (j / 3) * 3;
        for (int k = 0; k < 3; ++k) // box
            for (int m = 0; m < 3; ++m)
                if (val == sudokuBoard.getSudokuRows().get(boxRowOffset + k).getSudokuFields().get(boxColOffset + m).getValue())
                    return false;

        return true; // no violations, so it's legal
    }

    private void display() {
        System.out.println("The solved Sudoku \n");
        System.out.println(sudokuBoard);
    }
}
