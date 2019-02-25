import java.util.Comparator;

//Question4

public class SortBySalary implements Comparator<Question4> {
    @Override
    public int compare(Question4 emp1, Question4 emp2) {
        return (int) (emp2.salary - emp1.salary);
    }
}
