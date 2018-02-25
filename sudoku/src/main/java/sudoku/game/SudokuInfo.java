package sudoku.game;

import java.util.Scanner;

public class SudokuInfo {

    public SudokoDataDto getValue (Scanner scan) {
        int x = 0;
        int y = 0;
        int value = 0;

        System.out.println("Write location of value using (x,y,value)");
        do {
            System.out.println("Write location x form 1 to 9:");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a correct number! \nWrite new number:");
                scan.next();
            }
            x = scan.nextInt();
        } while (x < 1 || x >9);
        do {
            System.out.println("Write location y from 1 to 9:");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a correct number! \nWrite new number:");
                scan.next();
            }
            y = scan.nextInt();
        } while (y < 1 || y >9);
        do {
            System.out.println("Write value from 1 to 9:");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a correct number! \nWrite new number:");
                scan.next();
            }
            value = scan.nextInt();
        } while (value < 1 || value >9);
        return new SudokoDataDto(x,y,value);
    }

    public String infoGame (Scanner scan) {
        System.out.println("If You want solve Your sudoku write 'sudoku'");
        return scan.next();
    }
}
