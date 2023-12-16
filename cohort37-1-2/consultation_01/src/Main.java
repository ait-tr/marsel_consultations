/**
 * 12/16/2023
 * OOP
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        User marsel = new User();
//        marsel.name = "Marsel";
//        marsel.age = -10;
        marsel.setName("Marsel");
        marsel.setAge(-10);

        User alex = new User();
//        alex.name = "Alex";
//        alex.age = -5;
        alex.setName("Alex");
        alex.setAge(41);

//        alex = marsel;
//
//        marsel.age = 18;
//
//        System.out.println(alex.age);

        marsel.goToWork();
        alex.goToWork();

//        System.out.println(marsel.age);
        System.out.println(marsel.getAge());
        System.out.println(alex.getAge());
    }
}
