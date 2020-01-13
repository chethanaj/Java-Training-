package AnonymousInnerClassStructure;

public class Application {
    static Student.IDNumber getValue(final Student.IDNumber idNumber) {


        return new Student.IDNumber() {
            public String toString() {
                return "The value is" + idNumber;
            }
        };
    }

    public static void main(String[] args) {
        Student.IDNumber a =
                Application.getValue(new Student.IDNumber(10));
        System.out.println(a);
    }
}
