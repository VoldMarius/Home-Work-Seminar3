package operations;

import java.util.List;

public class AverageValue {
    public static int averageValue(List<Integer> list) {
        int res = 0;
        int lens = list.size();

        for (int i = 0; i < lens; i++) {
            res = res + list.get(i);
        }return res/lens;
    }
}


