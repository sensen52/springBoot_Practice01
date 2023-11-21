

import java.util.Arrays;

public class String_Example {

    public static void main(String[] args) {
        //toString, subString, eqauls, toUpperCase, toLowerCase, indexOf, replace, replaceAll

        //1. toString();
        Person person = new Person("sein",24);
        System.out.println(person);// Person{name='sein', age=24}

        //2. subString
        String originString = "sein,hello";
        String subString01 = originString.substring(2);
        String subString02 = originString.substring(2,6);
        System.out.println("subString01:"+subString01 +" | subString02:"+subString02);

        //3.equals();
        String a = "hello";
        String b = new String("hello");

//        if(a==b) {
//            System.out.println("값이 같습니다");
//        } else {
//            System.out.println("값이 다릅니다"); // == 는 참조 타입일 경우 주소값으로 비교
//        }

        if(a.equals(b)){
            System.out.println("값이 같습니다");
        } else {
            System.out.println("값이 다릅니다");
        }
//        String c = abc(); // null
//        if (c.equals("hello")) {
//            // 거짓
//            // Null 을 왜 참조하려고 하냐? 하고 NullPointerException
//        }
//        if ("hello".equals(c)) {
//            // 거짓
//
//        }


        // 4.toUpperCase()
        String name = "sein";
        System.out.println(name.toUpperCase());

        // 5.toLowerCase()
        String letter = "BIG LETTER";
        System.out.println(letter.toLowerCase());

        // 6.indexOf()
        String email = "example.user@example.com";
        int findIndex = email.indexOf("@");
        String username = email.substring(0, findIndex);

        System.out.println(findIndex);
        System.out.println("indexof:"+username);

        // 7. replace()
        String contry = "일본";
        String reContry = contry.replace("일본","대한민국");
        System.out.println(reContry);

        // 8. replaceAll()
        String address = "대구시 동구";
        String reAddress = address.replaceAll(".","서구");
        String reAddress2 = address.replaceAll("동구","서구");
        System.out.println(reAddress);

        //9. replaceFirst()
        String first = "안녕 반가워, 안녕";
        String reFirst = first.replaceFirst("안녕","세인아");
        System.out.println(reFirst);

        //10.trim()
        String originalString = "   Hello, World!   ";
        String trimmedString =originalString.trim();

        System.out.println("trim:"+trimmedString);
        // 11.charAt()
        String subject = "스프링부트";
        char charValue = subject.charAt(3);
        System.out.println("charValue"+charValue);

        // 12.getBytes()
        String st = "Hello, World!";
        byte[] utf8Bytes = st.getBytes();
        System.out.println(st);
        System.out.println("UTF-8 Bytes: "+ Arrays.toString(utf8Bytes));

        //13. valueOf
        int a1 =1;
        Integer integerValue = Integer.valueOf(a1);
        Class<?> q = integerValue.getClass();
        System.out.println("what:"+q.getName());

    }



}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}