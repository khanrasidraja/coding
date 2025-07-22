import java.util.*;
import java.util.function.BiConsumer;

public class biConsumer {
public static void main(String args[]){
    BiConsumer<Integer, Integer> con = (a,b)->System.out.print(a+b);
    con.accept(5,4);
}

}
