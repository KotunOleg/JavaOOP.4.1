import java.util.Comparator;

public class StudentLastNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Student student1 = (Student)o1;
        Student student2 = (Student)o2;

        String ln1 = student1.getLastName();
        String ln2 = student2.getLastName();

        if (ln1.compareTo(ln2)<0){
            return -1;
        }
        if (ln1.compareTo(ln2)>0){
            return 1;
        }

        return 0;
    }
}
