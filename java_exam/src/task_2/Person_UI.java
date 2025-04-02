package task_2;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Person_UI extends JFrame {
    public static void main(String[] args) {
        // Создание экземпляра окна
        Person_UI person_ui = new Person_UI();

        person_ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        person_ui.pack();
        person_ui.setVisible(true);
    }

    private List<Person> persons;

    public Person_UI() {
        super("Просмотр данных");
        setSize(300, 500);

        // Создание панели для вывода данных
        JPanel panel = new JPanel(new GridLayout(0, 1));
        getContentPane().add(panel, BorderLayout.CENTER);

        // Создание списка объектов
        persons = new ArrayList<>();
        persons.add(new Person("Yuri", 35, 172));
        persons.add(new Person("Tatiana", 36, 168));
        persons.add(new Person("Alexander", 30, 180));


        // Добавление данных каждого объекта на панель
        for (Person person : persons) {
            JLabel label = new JLabel(person.toString());
            panel.add(label);
        }


    }
}
