import java.util.Arrays;
public class StringClass {
    //QNO 1

    public void replaceSubstring(String s, String replaceStr, String replaceWithStr) {
        System.out.println("String before replacement is:" + s);
       String newStr= s.replaceAll(replaceStr, replaceWithStr);
        System.out.println("String After substring replacement is" + newStr);
    }


    //QNO 2
     public void dublicate(String s) {
        String[] word = s.toLowerCase().split(" ");
        System.out.print("Dublicate elements are:");
        for (int i = 0; i < word.length; i++) {
            int count = 0;
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count = count + 1;
                    word[j] = "0";
                }

            }
            if (count > 0) {
                System.out.print(word[i] + ",");
            }
        }
        System.out.println("");

    }




    //QNO 3
    public void occurenceOfCharacter(String s, String c) {
        int occurence = s.length() - (s.replaceAll(c, "")).length();
        System.out.println("character " + c + " appeared " + occurence + " times");
    }

    //QNO 4
    public void characterPercentage(String s) {
        int character = s.length();
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int others = 0;


        //Iterating through each character of inputString

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //If ch is in uppercase, then incrementing upperCaseLetters

            if (Character.isUpperCase(ch)) {
                upperCaseLetters++;
            }

            //If ch is in lowercase, then incrementing lowerCaseLetters

            else if (Character.isLowerCase(ch)) {
                lowerCaseLetters++;
            }

            //If ch is a digit, then incrementing digits

            else if (Character.isDigit(ch)) {
                digits++;
            }

            //If ch is a special character then incrementing others

            else {
                others++;
            }
        }
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / character;
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / character;
        double digitsPercentage = (digits * 100.0) / character;
        double otherCharPercentage = (others * 100.0) / character;

        System.out.println("Number of Lowercase character is " + lowerCaseLetters + "and Percentage is" + upperCaseLetterPercentage);
        System.out.println("Number of Upperrcase character is " + upperCaseLetters + "and Percentage is" + lowerCaseLetterPercentage);
        System.out.println("Number of Digits character is " + digits + "and Percentage is" + digitsPercentage);
        System.out.println("Number of Other character is " + others + "and Percentage is" + otherCharPercentage);

    }

    //QNO 5
     public void findCommonElement(int[] array1, int[] array2) {
        int flag = 0;
        System.out.println("Common elements are");
        for (int i : array1) {
            for (int j=0;j< array2.length;j++) {
                if (i == array2[j]) {
                    flag = 1;
                    array2[j]=0;
                    break;
                } else {
                    flag = 0;
                }

            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
    }


    //QNO 6
     public void findMissing(int[] array1) {
        Arrays.sort(array1);
        for (int i = 0; i < array1.length - 1; i += 2) {
            if (array1[i] - array1[i + 1] != 0) {
                System.out.println("missing element is:" + array1[i]);
            }
        }


    }
    //QNO 8
      public void reverseStr(String s) {
        StringBuffer revStr=new StringBuffer();
        for (int i =s.length()-1;i>=0;i--) {
            revStr.append(s.charAt(i));
        }
        System.out.println("Reversed string is"+revStr);
        StringBuffer buffer=new StringBuffer(revStr);
        buffer.delete(4,9);
        System.out.println("New string :"+buffer);



    }



}


