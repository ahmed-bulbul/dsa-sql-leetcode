package corejava.clonning;

public class Student implements Cloneable {
    int rollNo;
    Address address;


    @Override
    public Student clone() throws CloneNotSupportedException {
            Student student = (Student) super.clone();
            student.address = address.clone();

            return student;

    }
}
