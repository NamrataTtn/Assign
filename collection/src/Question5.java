import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question5 implements Comparable<Question5>{

String name;
Double score;
Double age;


    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    public Double getAge() {
        return age;
    }

    public Question5(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public int compareTo(Question5 o) {
        if(this.score-o.score==0)
            return this.name.compareTo(o.name);
        else
            return (int) (this.score-o.score);
    }

    public static void main(String[] args) {
        ArrayList<Question5> ar = new ArrayList<Question5>();
        ar.add(new Question5("Namrata", 89.0 ,19.0));
        ar.add(new Question5("Anita" ,87.0, 19.0));
        ar.add(new Question5("Adish", 96.6, 19.5));
        ar.add(new Question5("Vidhi", 96.6, 19.5));


        System.out.println("Unsorted");
        Iterator<Question5> iterator = ar.iterator();
        while (iterator.hasNext()){
            Question5 e = iterator.next();
            System.out.println(e.getName()+" "+e.getScore()+" "+e.getAge());
        }
        Collections.sort(ar,Question5::compareTo);

        System.out.println("\nSorted by score and name");
        Iterator<Question5> iterator1 = ar.iterator();
        while (iterator1.hasNext()){
            Question5 e = iterator1.next();
            System.out.println(e.getName()+" "+e.getScore()+" "+e.getAge());
        }

        System.out.println();

    }


}


