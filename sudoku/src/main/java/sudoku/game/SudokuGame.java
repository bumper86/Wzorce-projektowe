package sudoku.game;

public class SudokuGame {

    public static void main(String[] args) {

        SudokuBoard sb = new SudokuBoard();
        SampleBoard sampleBoard = new SampleBoard(sb);

        System.out.println(sb);
        SudokuProcessor sudokuProcessor = new SudokuProcessor(sb);
        sudokuProcessor.solvesudoku(0,0);
    }
}
