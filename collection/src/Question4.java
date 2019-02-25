import java.util.*;
import java.util.List;

public class Question4 {

        Double age;
        String empNme;
        Double salary;

    public Double getAge() {
        return age;
    }

    public String getEmpNme() {
        return empNme;
    }

    public Double getSalary() {
        return salary;
    }

    Question4(Double age, String name, Double salary)
        {
            this.age=age;
            this.empNme=name;
            this.salary=salary;
        }





    public static void main(String[] args) {

        Question4 e1 = new Question4(34.5, "aTestName", 64000.5);
        Question4 e2 = new Question4(24.0, "bTestName", 34000.5);
        Question4 e3 = new Question4(36.5, "cTestName", 74000.5);
        Question4 e4 = new Question4(36.5, "dTestName", 79000.5);
        List<Question4> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        Collections.sort(empList,new SortBySalary());
        Iterator<Question4> iterator = empList.iterator();
        while (iterator.hasNext()){
            Question4 e = iterator.next();
            System.out.println(e.getSalary()+" "+e.getEmpNme()+" "+e.getAge());
        }

        System.out.println();
    }
}
