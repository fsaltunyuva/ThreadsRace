import java.util.ArrayList;

public class ThreadOverride extends Thread {
    public ArrayList<Integer> list;
    public ArrayList<Integer> evenNumbers;
    public ArrayList<Integer> oddNumbers;

    public ThreadOverride(ArrayList<Integer> list, ArrayList<Integer> evenNumbers, ArrayList<Integer> oddNumbers) {
        this.list = list;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    @Override
    public void run() { //ArrayList<Integer> list, ArrayList<Integer> evenNumbers, ArrayList<Integer> oddNumbers
        for (Integer value : list) {
            if (value % 2 == 0)
                evenNumbers.add(value);
            else
                oddNumbers.add(value);
        }
    }


}


