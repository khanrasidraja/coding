import java.util.Scanner;
public class print {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int mul = 1;
        for(int i=0;i<2;i++){
            int n = s.nextInt();
            mul *= n;
        }
        System.out.print(mul);
    }
}
