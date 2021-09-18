import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(getLongest("aab"));
    }

    private static int getLongest(String word){
        if(word==null || word.isEmpty()){
            return 0;
        }
        int counter=0;

        Set<String>  set = new HashSet<>();
        SortedSet<Integer> sortedSet = new TreeSet();
        String[] chars = word.split("");

        boolean saved = false;

        for(int i=0; i<chars.length; i++){
            if(set.add(chars[i])){
                ++counter;
                saved = false;
            } else {
                sortedSet.add(counter);
                counter = 1;
                set = new HashSet<>();
                set.add(chars[i]);
                saved =true;
            }
        }

        if(!saved){
            sortedSet.add(counter);
        }

        return sortedSet.last();
    }
}
