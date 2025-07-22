public class happyno {
 public static boolean isHappy(int n) {
        int sq = 0,sum=0;
        while(n > 0){
            int rem = n % 10;
            sq = rem*rem;
            sum += sq;
            n = n/10;
        }
        return sum == 1;
    }
    public static void main(String[] args) {
        Boolean bol = isHappy(19);
        System.out.print(bol);
    }   
}
