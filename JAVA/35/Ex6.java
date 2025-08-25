/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  String getName() {
    return name;
  }
  int getAge() {
    return age;
  }
}
public class Ex6 {
  public static void main(String[] args) {
    Person person1 = new Person("영희", 21);
    Person person2 = new Person("철수", 22);
    System.out.println(person1.getName() + "는 " + person1.getAge() + "살 입니다.");  // 영희는 21살 입니다.
    System.out.println(person2.getName() + "는 " + person2.getAge() + "살 입니다.");  // 철수는 22살 입니다.
  }
}
