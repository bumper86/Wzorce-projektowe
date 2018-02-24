package sudoku.game;

import java.util.Scanner;

public class ScannerUser {
    private Scanner scanner = new Scanner(System.in);

    public String readEntry() {
        return scanner.nextLine().trim();
    }
}
