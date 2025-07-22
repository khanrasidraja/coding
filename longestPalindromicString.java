class longestPalindromicString {
    public static void main(String args[]){
       String s = "babad";
      String str = longestPalindrome(s);
        System.out.print(str);
    }
        public static String longestPalindrome1(String s) {
            String res = "";
            int reslength = 0;
            for (int i = 0; i < s.length(); i++) {
                int left = i, right = i;
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    if ((right - left + 1) > reslength){
                        res = s.substring(left, right + 1);
                        reslength = right - left + 1;}
                    left -= 1;
                    right += 1;
                }
                int l = i, r = i + 1;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    if ((r - l + 1) > reslength){
                        res = s.substring(l, r + 1);
                        reslength = r - l + 1;}
                    l -= 1;
                    r += 1;
                }
            }
            return res;
        }

    public static String longestPalindrome3(String s) {
        String ans= "";
        for(int i=0;i<s.length();i++) {
            int left = i, right = 0, maxLength = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if ((right - left + 1) > maxLength) {
                    ans = s.substring(left, right + 1);
                    maxLength = right - left + 1;
                    left -= 1;
                    right += 1;
                }
            }
            int l = i, r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > maxLength){
                    ans = s.substring(l,r+1);
                    maxLength = r-l+1;
                    l -= 1;
                    r += 1;
                }
            }

        }
        return ans;

    }

    public static String longestPalindrome(String s) {
        String ans = "";
        int length = 0;
        for(int i=0;i<s.length();i++){
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
                if ((right - left + 1) > length) {
                    ans = s.substring(left, right + 1);
                    length = right - left + 1;
                }
                    left -= 1;
                    right += 1;

            }
            int l = i, r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l)==s.charAt(r)){
                if ((r - l + 1) > length) {
                    ans = s.substring(l, r + 1);
                    length = r - l + 1;
                }
                l-=1;
                r+=1;
            }
        }
        return ans;

    }

    }
