import java.util.ArrayList;

public class ThreadOverride extends Thread {

    @Override
    public void run(ArrayList<Integer> list, ArrayList<Integer> evenNumbers, ArrayList<Integer> oddNumbers) {
        for(Integer value: list){
            if(value % 2 == 0)
                evenNumbers.add(value);
            else
                oddNumbers.add(value);
        }
    }


}


