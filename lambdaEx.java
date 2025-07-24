interface interef{
    public int m1(int n);
}
public class lambdaEx {
    public static void main(String args[]) {
        interef n = i -> i * i;
        System.out.print(n.m1(5));
    }
}
