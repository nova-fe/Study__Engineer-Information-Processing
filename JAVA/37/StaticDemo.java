/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */

class Student {
  int id; // Heap 영역에 저장됨
  String name;  // Heap 영역에 저장됨
  static String where = "Hackers";  // 따로 Method area 에 저장됨
}
public class StaticDemo {
  public static void main(String[] args) {
    Student stu1 = new Student();
    stu1.id = 10;
    stu1.name = "영희";
    System.out.println(stu1.id);  // 10
    System.out.println(stu1.name);  // 영희
    System.out.println(stu1.where);  // Hackers

    Student stu2 = new Student();
    stu2.id = 20;
    stu2.name = "철수";
    System.out.println(stu2.id);  // 20
    System.out.println(stu2.name);  // 철수
    System.out.println(stu2.where);  // Hackers
    System.out.println(Student.where);  // Hackers
  }
}
