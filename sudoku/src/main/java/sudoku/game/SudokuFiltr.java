package sudoku.game;

import java.util.stream.IntStream;

public class SudokuFiltr {
    public SudokuBoard setFieldValue(SudokuBoard board, SudokoDataDto dataDto) {
        if(isValueUsedInRow(board,dataDto)) {
            System.out.println("Value: " + dataDto.getValue() + " is used in row " + dataDto.getX());
            System.out.println("Please use different one!!");
        } else if (isValueUsedInColumn(board,dataDto)) {
            System.out.println("Value: " + dataDto.getValue() + " is used in column " + dataDto.getY());
            System.out.println("Please use different one!!");
        } else if (isValueUsedInLocalSquare(board,dataDto)) {
            System.out.println("Value: " + dataDto.getValue() + " is used in local square.");
            System.out.println("Please use different one!!");
        } else {
            board.getSudokuRows().get(dataDto.getX() - 1).getSudokuFields().get(dataDto.getY() - 1).setValue(dataDto.getValue());
        }
        return board;
    }

    private boolean isValueUsedInRow(SudokuBoard board, SudokoDataDto dataDto) {
        int x = dataDto.getX() - 1;
        int y = dataDto.getY() - 1;
        int value = dataDto.getValue();
        return IntStream.range(0,9)
                .filter(k -> k != x)
                .anyMatch(k -> board.getSudokuRows().get(k).getSudokuFields().get(y).getValue() == value);
    }

    private boolean isValueUsedInColumn(SudokuBoard board, SudokoDataDto dataDto) {
        int x = dataDto.getX() - 1;
        int y = dataDto.getY() - 1;
        int value = dataDto.getValue();
        return IntStream.range(0,9)
                .filter(l -> l!=y)
                .anyMatch(l -> board.getSudokuRows().get(x).getSudokuFields().get(l).getValue() == value);
    }

    private boolean isValueUsedInLocalSquare(SudokuBoard board, SudokoDataDto dataDto) {
        int x = dataDto.getX() - 1;
        int y = dataDto.getY() - 1;
        int value = dataDto.getValue();
        int xMin = minLimit(x);
        int xMax = maxLimit(x);
        int yMin = minLimit(y);
        int yMax = maxLimit(y);
        for (int i = yMin; i < yMax; i++)
            for (int j = xMin; j < xMax; j++)
                if(j != x && i!= y)
                    if(board.getSudokuRows().get(j).getSudokuFields().get(i).getValue() == value)
                        return true;
        return false;
    }

    private static int minLimit(int next) {
        if (next < 3)
            return 0;
        else if (next < 6)
            return 3;
        else
            return 6;
    }

    private static int maxLimit(int next) {
        if (next < 3)
            return 3;
        else if (next <6)
            return 6;
        else
            return 9;
    }
}
