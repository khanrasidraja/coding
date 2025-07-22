import java.util.*;
public class subStrings {
    public static void main(String args[]){
//        String s = "abcabc", ans = "";
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        String ans1 = new String(chars);
//        int n = ans1.length(), count = 0;
//        for(int i=0;i<ans1.length();){
//            for(int j = i+2;j<ans1.length();) {
//                ans = ans1.substring(i, j + 1);
//                System.out.println(ans);
//                if(ans.contains("a") && ans.contains("b") && ans.contains("c")){
//                    count++;
//                }
//                j++;
//            }
//            i++;
//        }
//        System.out.println(count);

        String s= "abcabc";
        System.out.println(numberOfSubstrings(s));

    }

    public static int numberOfSubstrings1(String s){
        String ans = "";
        int n = s.length(), count = 0;
        for(int i=0;i<n;){
            for(int j=i+2;j<n;){
            ans = s.substring(i,j+1);
            if(ans.contains("a") && ans.contains("b") && ans.contains("c")){
                count = Math.max(count, j-i-1);
            }
        j++;}
        i++;
        break;}
        return count;
    }
    public static int numberOfSubstrings(String s){
        int[] seen = {-1,-1,-1};
        int count  = 0;
        for(int pos = 0; pos<s.length();pos++){
            seen[s.charAt(pos) - 'a'] = pos;
            count += 1+Math.min(seen[0],Math.min(seen[1],seen[2]));
        }
        return count;
    }
}
