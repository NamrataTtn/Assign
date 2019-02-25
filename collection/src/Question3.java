import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {


    public void countOccurenceOfCharacters(String str) {
        char[]char_array =str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int flag = 0;
        for (char c:char_array) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        for( Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println("Character "+entry.getKey()+" occured "+entry.getValue()+" times");

        }

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine().toLowerCase();
        Question3 obj=new Question3();
        obj.countOccurenceOfCharacters(s);

    }

}
