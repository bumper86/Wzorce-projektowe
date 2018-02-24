package sudoku.game;

import java.util.Arrays;

public class SampleBoard {
    private SudokuBoard board;

    public SampleBoard(SudokuBoard board) {
        this.board = board;
        fill();
    }

    private void fill() {
        board.getSudokuRows().get(0).getSudokuFields().get(1).setValue(2);
        board.getSudokuRows().get(0).getSudokuFields().get(3).setValue(5);
        board.getSudokuRows().get(0).getSudokuFields().get(5).setValue(1);
        board.getSudokuRows().get(0).getSudokuFields().get(7).setValue(9);


        board.getSudokuRows().get(1).getSudokuFields().get(0).setValue(8);
        board.getSudokuRows().get(1).getSudokuFields().get(3).setValue(2);
        board.getSudokuRows().get(1).getSudokuFields().get(5).setValue(3);
        board.getSudokuRows().get(1).getSudokuFields().get(8).setValue(6);

        board.getSudokuRows().get(2).getSudokuFields().get(1).setValue(3);
        board.getSudokuRows().get(2).getSudokuFields().get(4).setValue(6);
        board.getSudokuRows().get(2).getSudokuFields().get(7).setValue(7);

        board.getSudokuRows().get(3).getSudokuFields().get(2).setValue(1);
        board.getSudokuRows().get(3).getSudokuFields().get(6).setValue(6);

        board.getSudokuRows().get(4).getSudokuFields().get(0).setValue(5);
        board.getSudokuRows().get(4).getSudokuFields().get(1).setValue(4);
        board.getSudokuRows().get(4).getSudokuFields().get(7).setValue(1);
        board.getSudokuRows().get(4).getSudokuFields().get(8).setValue(9);

        board.getSudokuRows().get(5).getSudokuFields().get(2).setValue(2);
        board.getSudokuRows().get(5).getSudokuFields().get(6).setValue(7);

        board.getSudokuRows().get(6).getSudokuFields().get(1).setValue(9);
        board.getSudokuRows().get(6).getSudokuFields().get(4).setValue(3);
        board.getSudokuRows().get(6).getSudokuFields().get(7).setValue(8);

        board.getSudokuRows().get(7).getSudokuFields().get(0).setValue(2);
        board.getSudokuRows().get(7).getSudokuFields().get(3).setValue(8);
        board.getSudokuRows().get(7).getSudokuFields().get(5).setValue(4);
        board.getSudokuRows().get(7).getSudokuFields().get(8).setValue(7);

        board.getSudokuRows().get(8).getSudokuFields().get(1).setValue(1);
        board.getSudokuRows().get(8).getSudokuFields().get(3).setValue(9);
        board.getSudokuRows().get(8).getSudokuFields().get(5).setValue(7);
        board.getSudokuRows().get(8).getSudokuFields().get(7).setValue(6);
    }

}
