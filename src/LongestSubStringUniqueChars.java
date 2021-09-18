import java.util.HashMap;
import java.util.LinkedList;

public class LongestSubStringUniqueChars {
    public static void main(String[] args) {
        System.out.println(longestkSubstr("aabacbebebe", 3));

        System.out.println((int)'a');

        LinkedList list = new LinkedList();
    }

    public static int longestkSubstr(String s, int k) {
        // code here
        if (s.isEmpty()) {
            return -1;
        }
        //aabbcc
        String[] arr = s.split("");
        int tempK = k;
        String longest = "";
        int count = 0;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = i;
            if (arr[i].equals(arr[curr++])) {
                longest = longest + arr[i];
                System.out.println(longest);
            } else {
                if (tempK > 0) {
                    longest = longest + arr[i];
                    tempK--;
                    System.out.println("reduce");
                } else {
                    if (longest.length() > count) {
                        count = longest.length();
                    }
                    map.put(longest.length(), longest);
                    longest = arr[i - 1];
                }
            }
        }

        if(longest.length() >  count){
            count = longest.length();
        }
        return count;
    }
}
