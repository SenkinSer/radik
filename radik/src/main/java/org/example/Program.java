package org.example;

public class Program{

    public static void main(String[] args) {

        String s = "123";
        int number;
        number = Integer.parseInt(s);
        number = number + 5;
        System.out.println(number);
    }
    static void changePerson(Person p){
        p = new Person("Alice");    // p указывает на новый объект
        p.setName("Ann");
    }
    static void changeName(Person p){
        p.setName("Alice");
    }
}
class Person{

    private String name;

    Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return this.name;
    }
}