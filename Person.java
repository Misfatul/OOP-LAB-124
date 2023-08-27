package oop_lab_report_1;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String Name() {
        return name;
    }
    public int Age() {
        return age;
    }
}
//main method
public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Misfa", 20);
    Person person2 = new Person("Jannat", 26);
    System.out.println(person1.Name() + " is " + person1.Age() + " years old.");
    System.out.println(person2.Name() + " is " + person2.Age() + " years old.");
  }
}

