package ru.anna.musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); //запуск файла

        Computer computer = classPathXmlApplicationContext.getBean("computer",Computer.class);
        System.out.println(computer);

        classPathXmlApplicationContext.close();
    }
}
