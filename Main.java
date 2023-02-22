import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            if (i <= 2500) {
                list1.add(i);
            } else if (i > 2500 && i <= 5000) {
                list2.add(i);
            } else if (i > 5000 && i <= 7500) {
                list3.add(i);
            } else {
                list4.add(i);
            }

            list.add(i);
        }

        ThreadOverride t1 = new ThreadOverride(list1, evenNumbers, oddNumbers);
        ThreadOverride t2 = new ThreadOverride(list2, evenNumbers, oddNumbers);
        ThreadOverride t3 = new ThreadOverride(list3, evenNumbers, oddNumbers);
        ThreadOverride t4 = new ThreadOverride(list4, evenNumbers, oddNumbers);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}