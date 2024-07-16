package lab6.ex1.person;

public class TestMain {
    public static void main(String[] args) {
        Student student = new Student("Tran Van Loi", "Ha Noi", "Advanced", 2019, 5000);
        System.out.println(student);

        Staff staff = new Staff("Tran Van Loi", "Ha Noi", "HUS", 10000);
        System.out.println(staff);
    }
}
