import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            System.out.println(i + "번째 사람의 이름을 입력하시오");
            String alias = sc.next();
            names.add(alias);
        }

        int maxIndex = 0;
        for(int j = 1; j < names.size(); j++){
            if(names.get(maxIndex).length() < names.get(j).length()){
                maxIndex = j;
            }
        }

        System.out.println("제일 긴 별명 : " + names.get(maxIndex));
    }
}
