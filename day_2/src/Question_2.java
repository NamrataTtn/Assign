
import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String To Sort : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int i, j, n = arr.length;
        char temp;
        boolean swapped;
        for (i = 0; i < n-1; i++)
        {
            swapped = false;
            for (j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

        //s = Arrays.toString(arr);
        System.out.println(new String(arr));

    }
}
