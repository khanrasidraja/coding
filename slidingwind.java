import java.util.*;
public class slidingwind {
        //    int a = 0, b = 1 ,c=0;
        //    System.out.println(a);
        //    System.out.println(b);
        //    for(int i=1;i<5;i++){
        //    c = a+b;
        //    a=b;
        //    b=c;
           
        // } 
        // System.out.println(c);

        // int n = 234632401;
        // int temp = 0;
        // while(n > 0){
        //     int last = n%10;
        //       System.out.print(last);
        //      n = n/10;
           
           
        // }
        //    Scanner sc = new Scanner(System.in);
        //    System.out.print("Enter the 1st number :");
        //    int m = sc.nextInt();
        //     System.out.print("Enter operator :");
        //    char op = sc.next().trim().charAt(0);
        //    System.out.print("Enter the 2nd number :");
        //    int n = sc.nextInt();
            
        //   switch(op){
        //     case '+' -> System.out.println(m+n);
        //     case '-' -> System.out.println(m-n);
        //     case '*' -> System.out.println(m*n);
        //     case '/' -> System.out.println(m/n);
        //     case '%' -> System.out.println(m%n);
        //     default -> System.out.println("Invalid operator");
        //   }

    public int maxLength(int arr[],int ans) {
        for (int i = 0; i < arr.length; i++) {
             ans = lcm(arr[i],ans);
        }

      return ans;
    }
    public int gcd(int a, int b){
        return b==0 ? a : gcd(b,a%b);
    }
    public int lcm(int a, int b){
        return a*b/gcd(a,b);
    } 
    
      public static void main(String args[]){
        int arr[] = {1,2,1,2,1,1,1};
        int ans = 0;
        slidingwind s = new slidingwind();
        int a = s.maxLength(arr,ans);
        System.out.println(a);
    }
}
