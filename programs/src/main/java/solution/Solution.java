package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(15));

    }

    static int solution (int number) {
        int result = 0;
        int counter = 0;
        List<Integer> binary = new ArrayList<>();
        do {
            binary.add(number%2);
            number = number/2;
            if (number == 1) {
                binary.add(1);
            }
        } while (number != 1);
        for (int l = 0; l < binary.size(); l++) {
            if(binary.get(l)== 0) {
                counter++;
            } else {
                    result = Math.max(result,counter);
                    counter = 0;
                }
                result = Math.max(result,counter);
        }
        if (counter == binary.size()) {
            return counter;
        }
        return result;
    }
}
