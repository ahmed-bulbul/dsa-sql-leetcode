package corejava.clonning;

public class StudentTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student obj1 = new Student();
        obj1.rollNo = 1;

        Address address = new Address();
        address.addressId = 22;

        obj1.address = address;

        Student obj2 = obj1.clone();
        obj2.rollNo = 5;
        obj2.address.addressId = 39;


        System.out.println(obj1.rollNo);
        System.out.println(obj2.rollNo);


        System.out.println(obj1.address.addressId);
        System.out.println(obj2.address.addressId);
    }
}
