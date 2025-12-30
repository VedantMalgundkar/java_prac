import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,7,8,1,2);
        Predicate<Integer> filterPredicate = new Predicate<Integer>() {
            public boolean test(Integer num) {
                return num % 2 == 0;
            }
        };
        Function<Integer,Integer> fn = new Function<>() {
            public Integer apply(Integer num) {
                return num + 1;
            }
        };
        BinaryOperator<Integer> biFn = new BinaryOperator<Integer>() {
            public Integer apply(Integer acc,Integer curr) {
                return acc + curr;
            }
        };
        int res = list.stream()
                        // .filter(n-> n%2 ==0)
                        .filter(filterPredicate)
                        // .map((num)->num+1)
                        .map(fn)
                        // .reduce(0, (acc, curr)-> acc + curr)
                        .reduce(0, biFn)
                        ;   
        System.out.println(res);
    }
}