package sudoku.game;

public class SudokuGame {

    public static void main(String[] args) {

        SudokuBoard sb = new SudokuBoard();
         new SampleBoard(sb);

        System.out.println(sb);
        new SudokuProcessor(sb);

    }
}
