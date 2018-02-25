package sudoku.game;

import java.util.Scanner;

public class SudokuGame {

    public static void main(String[] args) {
        boolean end = true;
        Scanner scan = new Scanner(System.in);
        while (end) {
            String info = "";
            SudokuInfo sudokuInfo = new SudokuInfo();
            SudokuBoard sb = new SudokuBoard();
            SudokuFiltr filtr = new SudokuFiltr();
            while (!info.equals("SUDOKU")) {
                sb = filtr.setFieldValue(sb, sudokuInfo.getValue(scan));
                System.out.println(sb);
                info = sudokuInfo.infoGame(scan).toUpperCase();
            }
            new SudokuProcessor(sb);
            SudokuEnd sudokuEnd = new SudokuEnd();
            end = sudokuEnd.theEnd(scan);
        }
        scan.close();
    }
}
