import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    public int age;
    public String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student thatStudent) {
        return this.age <= thatStudent.age ? 1 : -1;  
    }
}

public class SortingExample {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        List<Student> studs = new ArrayList<>();

        Student raj = new Student(19, "raj");
        Student ramesh = new Student(56, "ramesh");
        Student robert = new Student(25, "robert");
        Student clerk = new Student(20, "clerk");

        studs.add(raj);
        studs.add(ramesh);
        studs.add(robert);
        studs.add(clerk);
        
        Comparator<String> com = new Comparator<String>() {
            public int compare(String one, String two) {
                return one.length() >= two.length() ? -1 : 1;
            }
        };

        nameList.add("Raju");
        nameList.add("Ramesh");
        nameList.add("Rakesh patel");
        nameList.add("dscvfbtgny");
        nameList.add("efcvgrbhnevrbtn");
        Collections.sort(nameList,com);

        Collections.sort(studs);
        
        System.out.println(nameList);

        for (Student stud : studs) {
            System.out.println(stud.age + " "+ stud.name);
        }
    }
}