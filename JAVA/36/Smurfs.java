

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class Smurfs {
  String name;
  String role;
  int age;

  Smurfs(String name) {
    this(name, 21, "미정"); // this()를 사용하면 매개변수가 일치하는 다른 생성자를 호출할 수 있음
    // => this에 3개의 매개변수가 들어가는 Smurfs(String name, int age, String role) 호출
  }

  Smurfs(String name, int age) {
    this(name, age, "사원");
  }

  Smurfs(String name, int age, String role) {
    this.name = name;
    this.age = age;
    this.role = role;
  }

  String getSome() {
    return this.name + "은 " + this.age + "살 " + this.role;
  }

  public static void main(String[] args) {
      Smurfs s1 = new Smurfs("스머프1");
      Smurfs s2 = new Smurfs("스머프2", 22);
      Smurfs s3 = new Smurfs("스머프3", 23, "개발자");
      System.out.println(s1.getSome()); // 스머프1은 21살 미정
      System.out.println(s2.getSome()); // 스머프2은 22살 사원
      System.out.println(s3.getSome()); // 스머프3은 23살 개발자

  }
}
