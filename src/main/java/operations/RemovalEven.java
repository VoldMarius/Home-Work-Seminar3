package operations;

import java.util.*;

public class RemovalEven {
    public static List<Integer> removalEven(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i)%2 == 0)
            {
                list.remove(i);
                i--;
            }
        }return list;
    }
}
