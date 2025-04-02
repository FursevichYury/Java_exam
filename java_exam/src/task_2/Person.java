package task_2;

// Класс Person
public class Person {
    // Приватные поля
    private String name;
    private int age;
    private double height;

    // Конструкторы класса
    public Person() {}
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Геттеры и сеттеры
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    // Метод introduce()
    public void introduce() {
      System.out.println("Меня зовут " + name + ", мне " + age + " лет, мой рост " + height + " см.");
    }

        @Override
        public String toString() {

        return "Меня зовут " + name + ", мне " + age + " лет, мой рост " + height + " см.";
        }
    }




