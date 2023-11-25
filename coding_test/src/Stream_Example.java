import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Example {
    public static void main(String[] args){

        String[] arr = {"A","B","C"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);


// 리스트 => 스트리
//        List<String> list  = Arrays.asList("A","B","C");
//        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);

//       Stream.Builder<String> builder = Stream.builder(); //스트림 빌더 생성
//
//        builder.add("One");
//        builder.add("Two");
//        builder.add("Three");
//
//
//        Stream<String> stream = builder.build(); //빌더로 부터 스트림 생성
//
//        stream.forEach(System.out::println);

        int[] numbers = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(numbers)
                .reduce(0, (x, y) -> {
                    System.out.println("x: " + x + ", y: " + y);
                    return x + y;
                });

        System.out.println("Final Result: " + sum);


    }
}
