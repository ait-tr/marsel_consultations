/**
 * 12/16/2023
 * OOP
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class User {
    // fields, поля
    private String name; // имя
    private int age; // возраст

    // ваш собственный пустой конструктор
    public User() {

    }

    // ваш конструктор с параметрами
    public User(String name, int age) {
//        this.name = name;
//
//        if (age > 0) {
//            this.age = age;
//        } else {
//            System.err.println("Возраст не может быть отрицательным");
//            this.age = 1;
//        }
        setName(name);
        setAge(age);
    }

    public void goToWork() {
        System.out.println("Меня зовут  " + name + " и я иду на работу!");
    }

    // метод доступа - сеттер
    public void setAge(int age) {
        // если возраст, который мы хотим задать - положительное число
        if (age > 0) {
            this.age = age; // сохраняем этот возраст в поле
        } else {
            // если возраст - отрицательный
            this.age = 1; // сохраняем 1-у и выдаем ошибку
            System.err.println("Возраст не может быть отрицательным, по умолчанию = 1");
        }
    }

    // поскольку, метод возвращает значение целого типа - он помечается как int, а не void
    public int getAge() {
        // return - оператор возврата значения из метода
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
