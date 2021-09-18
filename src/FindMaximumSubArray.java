import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindMaximumSubArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(100);list.add(200);list.add(300);list.add(400);
        System.out.println(maximumSumSubarray(2, list, list.size()));
    }

    static int maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        // code here
        TreeSet<Integer> set = new TreeSet();

        for(int y=0; y <= Arr.size() -K; y++){
            int sum = 0;
          //  sum = Arr.get(y) + Arr.get(y+1);
            for(int i=0; i< K; i++){
                System.out.println(y +i);
                sum += Arr.get(y+i);
                System.out.println(sum);
            }
            System.out.println(sum);
            set.add(sum);
        }

        return set.pollLast();
    }
}
