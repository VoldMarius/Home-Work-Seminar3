package operations;

import java.util.ArrayList;
import java.util.List;

public class UnificationUnique {
    public static List<Integer> unification(List<Integer> list, List<Integer> list1) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list.get(i) == list1.get(j)) {
                    list1.remove(list1.get(j));
                }
            }
        }
        List<Integer> unification = new ArrayList<Integer>(list.size() + list1.size());
        unification.addAll(list);
        unification.addAll(list1);

        return unification;
    }
}
