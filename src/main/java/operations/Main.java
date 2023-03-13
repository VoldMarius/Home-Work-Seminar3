package operations;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Реализовать алгоритм сортировки слиянием

        int[] num = new int[]{47, 58, 69, 28, 5, 885, 99,2};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(MergeSort.sort(num)[i]+"  ");
        }



        // Пусть дан произвольный список целых чисел, удалить из него чётные числа
        System.out.println();
        List numlist1 = new ArrayList(Arrays.asList(47, 58, 69, 28, 5, 885, 99, 2, 97, 6, 1, 13));
        System.out.println("Исходный список чисел:  " + numlist1);
        System.out.println("Список без четных чисел:  " + RemovalEven.removalEven(numlist1));


        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        List intnumlist = new ArrayList(Arrays.asList(47, 58, 69, 28, 5, 885, 99, 2, 97, 6, 1, 13));
        System.out.println("Максимальное значение :  " + Collections.max(intnumlist));
        System.out.println("Минимальное значение :  " + Collections.min(intnumlist));
        System.out.println("Среднее значение :  " + AverageValue.averageValue(intnumlist));

        // Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        List intNumlistt = new ArrayList(Arrays.asList(12, 58, 69, 28, 5, 58, 99, 2));
        List intNummlist = new ArrayList(Arrays.asList(47, 85, 58, 28, 5, 885, 19, 2, 97,58, 99, 13));
        System.out.println(UnificationUnique.unification(intNumlistt,intNummlist));

        //Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        long start = System.currentTimeMillis();
        ArrayList numlistt = new ArrayList();
        while (numlistt.size()< 10000){
            numlistt.add(0,0);

        }System.out.println(numlistt.size());
        long finish = System.currentTimeMillis();
        long rez = finish - start;
        System.out.println(" Время выполнения средством ArrayList  " +  rez);
        long start1 = System.currentTimeMillis();

        //Создать LinkedList и добавить нулевым эллементом ноль 10000 раз.
        LinkedList<Integer> linkedlistt = new LinkedList<>();
        while (linkedlistt.size()< 10000){
            linkedlistt.add(0,0);

        }System.out.println(linkedlistt.size());
        long finish1 = System.currentTimeMillis();
        long rez1 = finish1 - start1;
        System.out.println(" Время выполнения средством  LinkedList " +  rez1);


        }

    }

