import java.util.*;

public class longestSubstringUnique {
public static void main(String args[]){
    String s = "pwwkew";
    System.out.print(lengthOfLongestSubstring3(s));
}
        public static int lengthOfLongestSubstring(String s) {
         Set<Character> set = new HashSet<>();
         int l=0,r=0, maxlength=0;
         while(r<s.length()) {
             if(!set.contains(s.charAt(r))){
                 set.add(s.charAt(r));
                 maxlength = Math.max(maxlength, r-l+1);
                 r++;
             }
             else{
                 set.remove(s.charAt(l));
                 l++;
             }
         }
         return maxlength;
    }

    public static String lengthOfLongestSubstring2(String s) {
       Set<Character> set = new HashSet<>();
       int longestSubString = 0;
           int left = 0, right = 0;
           String answer = "";
           while (right < s.length()) {
               if (!set.contains(s.charAt(right))) {
                   set.add(s.charAt(right));
                   answer = s.substring(left,right+1);
                   longestSubString = Math.max(longestSubString, right - left + 1);
                   right += 1;
               } else {
                   set.remove(s.charAt(left));
                   left += 1;
               }
           }


       return answer;
    }

    public static int lengthOfLongestSubstring3(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, sum = 0, maxsum = 0;
        for(int i=0; i<s.length();){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxsum = Math.max(maxsum, i - left + 1);
                i++;
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxsum;
    }

}
