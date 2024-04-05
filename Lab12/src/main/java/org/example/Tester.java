package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private Float salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, Float salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public Tester() {
        this("Stanislav", "Peshko");
    }

    public Tester(String name, String surname) {
        this(name, surname, 5, "B", 30.000F);
    }

    public void Method() {
        System.out.println(this.name + "\n" + this.surname + "\n" + this.expirienceInYears + "\n" + this.englishLevel + "\n" + this.salary + "\n");
    }
    public void Method(String s) {
        System.out.println(s + "\n");
    }

    public void Method(String num, String a) {
        System.out.println("Это метод " + num + "который вызывает метод 1 " + a);
        this.Method();
    }

    public static void MethodStat() {
        System.out.println("Это статический метод");
    }
}
