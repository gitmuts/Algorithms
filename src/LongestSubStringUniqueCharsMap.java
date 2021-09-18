import java.util.HashMap;
import java.util.Map;

public class LongestSubStringUniqueCharsMap {
    public static void main(String[] args) {

        String word = "aabacbebebe";
        int k =3;
        int max=-1;
        // have two pointers, a_pointer and b_pointer, move window from left to right

        int aPointer=0;
        Map<Character, Integer> charCount = new HashMap<>();

        for(int bPointer=0; bPointer< word.length(); bPointer++){
            charCount.put(word.charAt(bPointer), charCount.getOrDefault(word.charAt(bPointer), 0)+1);
            while(charCount.size() > k){
                //move to the right and decrement count of that char
                charCount.put(word.charAt(aPointer), charCount.getOrDefault(word.charAt(aPointer),0)-1);

                // why ???
                if(charCount.get(word.charAt(aPointer)) == 0){
                    charCount.remove(word.charAt(aPointer));
                    System.out.println("Removing "+ word.charAt(aPointer));
                }

                //move a pointer to the right
                aPointer++;
            }

            if(charCount.size() == k){
                max = Math.max(max, (bPointer - aPointer)+1);
            }
        }

        System.out.println(charCount);
        System.out.println(max);
    }



}
