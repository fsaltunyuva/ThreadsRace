import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        Thread t4 = new Thread();

        for(int i = 1; i<=10000; i++){
            if(i<=250){
                list1.add(i);
            }
            else if (i>250 && i<=500) {
                list2.add(i);
            }
            else if (i>500 && i<=750) {
                list3.add(i);
            }
            else{
                list4.add(i);
            }

            list.add(i);
        }



    }
}