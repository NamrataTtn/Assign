import java.util.*;

public class Question2 {

    public void countUniqueCharacter(String str) {
        char[] char_array =str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int flag = 0;
        for (char c:char_array) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
      int count=0;
       for( Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() ==1) {

                count++;
            }
            
        }
        System.out.println("the number of unique characters in the string  "+str+" is "+count);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine().toLowerCase();
        Question2 obj=new Question2();
        obj.countUniqueCharacter(s);

    }
}
