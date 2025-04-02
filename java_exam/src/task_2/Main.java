package task_2;

public class Main extends Person {
    public static void main(String[] args) {

        // Создание нескольких объектов типа Person
        Person person1 = new Person("Yuri", 35, 172);
        Person person2 = new Person("Tatiana", 36, 168);
        Person person3 = new Person("Alexander", 30, 180);

        // Вызов метода introduce() для каждого объекта
        person1.introduce();
        person2.introduce();
        person3.introduce();

        }
   }

