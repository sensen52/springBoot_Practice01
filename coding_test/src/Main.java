import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // JAVA
        // 자료형, 조건문(if), 반복문(for), List/Map (collection), 끝
        // 실무에서 if 말고 switch 이런거 안씀
        // try-catch도 Spring 안하면
        // 자료형
        // int, boolean, String, double 실수, BigDecimal 많은 수를 표현 하는 클래스
        int a = 1;
        boolean b = false;
        String c = "SEIN";
        double d = 1.1;
        BigDecimal e = new BigDecimal("123781123123123123273891273981273");
        e = e.add(e);
        System.out.println(e.toString());
        //////////////////////////////////////
        // 조건문 //
        if (a < 5) {
            // 괄호가 맞으면 여기로 와
        } else if (a == 1) {
            // 괄호가 맞다는 여기로 와
        } else {
            // 다 틀리면 여기로 와
        }
        int x = 1;
        int y = 2;
        int z = x - y;
        if (1 + 2 < x + y) {
            // 여기
            System.out.println("여기");
        } else {
            // 여기2
            System.out.println("여기2");//
        }

        if (x != y) {
            // 여기
            System.out.println("여기");//
        } else {
            // 여기2
            System.out.println("여기2");
        }

        if (y >= 2) {
            // 여기
            System.out.println("여기");//
        } else {
            // 여기2
            System.out.println("여기2");
        }

        if (x < y) {
            // 여기
            System.out.println("여기");//
        } else {
            // 여기2
            System.out.println("여기2");
        }
        /////////////////////////////////

        // 반복문 //
        // 1번째 형식 - 전통적인 for문
        for (int i = 0; i < 5; i++) {
            // i가 0부터 5전인 4까지 1씩 더하면서 반복한다
            // 1번째 항 (int i = 0;) 값 초기화
            // 2번째 항 (i < 5;) 반복 수행할 조건
            // 3번째 항 (i++;) 증감식 표현 (반복 끝날 때 수행할 거)
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2번째 형식 - foreach 문 (List /Map 배우고 해야함)

        ////////////////////////////////

        //  List/Map (collection)
        // 1. List
        List<String> stringList = new ArrayList<>();
//        List<Integer> 변수명2 = new ArrayList<>();

        // 각 자료형마다 원형 클래스가 있음
        // 고민1: int = Integer / double = Double / char = Character / long = Long / boolean = Boolean
        stringList.add("안녕");
        stringList.add("세인아");
//        stringList.remove(0);
//        stringList.clear(); // 전부다 지운다
        boolean isEmpty = stringList.isEmpty(); // 지금 당장 상태가 비어있으면 true, 아니면 false

        if (isEmpty) {
            // 비어있으니까 ~~해
        }

        for (int i = 0; i < stringList.size(); i++) {
            String item = stringList.get(i);
        }

        stringList.stream(); // **** 제일 중요. JDK 8버전 (옛날 용어로 1.8버전) 부터 생김
        // JDK가 자바 개발 키트인데
        // 1.8까지만 1.몇 이라고 버전을 불렀음
        // 8,9,10,11 이렇게 부름 (22인가 까지 나왔는데, 실제로 실무에서는 JDK 17, 안좋은 회사는 아직도 1.7. JDK 8때 Stream이 생김  )

        List<String> list2 = stringList.stream()
                .filter(data -> data.equals("안녕"))
                .collect(Collectors.toList()); // collect() 함수는 stream의 결과를 돌려준다!
        // List로 돌려줄 때는 무조건 Collectors.toList()

        for (int i=0; i<stringList.size(); i++) {
            if (stringList.get(i).equals("안녕")) {
                // 그 애
            }
        }
        // 고민2: Stream의 함수 10가지 알아보기.
        // stream() 랑 collect() 가 뭘 의미하는지
        // filter() 사용방법
        // LinkedList - 안씀 (코테에서만 사용)

        ///////////// 2. Map
        Map<String, String> map = new HashMap<>();
        map.put("name", "세인");
        String abcd = map.get("name");
        System.out.println(abcd);
        // put(), get(), size(), values(), isEmpty(), clear()
    }
}