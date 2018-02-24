package sudoku.game;

public class SudokuProcessor {
    private SudokuBoard sudokuBoard = new SudokuBoard();

    public SudokuProcessor(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    private int checkRow(int x, int value) {
        for (int i = 0; i < 9; i++) {
            if (sudokuBoard.getSudokuRows().get(x).getSudokuFields().get(i).getValue() == value) return 0;
        } return 1;
    }

    private int checkColumn (int y, int value) {
        for (int i = 0; i < 9; i++) {
            if (sudokuBoard.getSudokuRows().get(i).getSudokuFields().get(y).getValue() == value) return 0;
        } return 1;
    }

    private int checkGrid(int x, int y , int value) {
        x = (x / 3) * 3;
        y = (y / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudokuBoard.getSudokuRows().get(x + i).getSudokuFields().get(y + j).getValue() == value) return 0;
            }
        } return 1;
    }

    private void navigate(int x, int y) {
        if (y < 8)
            solvesudoku(x, y + 1);
        else
            solvesudoku(x + 1, 0);
    }

    public void display() {
        System.out.println("The solved Sudoku \n");
                System.out.println(sudokuBoard);
                System.exit(0);
    }

    public void solvesudoku(int x, int y) {
        if (x > 8)
            display();
        if (sudokuBoard.getSudokuRows().get(x).getSudokuFields().get(y).getValue() != 0) {
            navigate(x, y);
        } else {
            for (int i = 1; i <= 9; i++) {
                if ((checkRow(x, i) == 1) && (checkColumn(y, i) == 1) && (checkGrid(x, y, i) == 1)) {
                    sudokuBoard.getSudokuRows().get(x).getSudokuFields().get(y).setValue(i);
                    navigate(x, y);
                }
            }
        }
        sudokuBoard.getSudokuRows().get(x).getSudokuFields().get(y).setValue(0);
    }
}
