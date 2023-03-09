import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0 ){
                array[i] = array[i]+1;
            }
        }

        System.out.println(Arrays.toString(array));

        Arrays.stream(array)
                .skip(2)
                .limit(5)
                .forEach(e->System.out.print(e + " "));


    }
}