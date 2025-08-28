/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class Smurfs {
  String name;
  int age;
  static int howmany;

  Smurfs(String name) {
    this(name, 21);
  }

  Smurfs(String name, int age) {
    this.name = name;
    this.age = age;
    howmany++;  
    // 1) Smurfs s1 을 통해 실행되면서 1이 됨
    // 2) Smurfs s2 을 통해 실행되면서 2가 됨
  }

  @Override
  public String toString() {
    return this.name + " " + this.age;
  }
}

public class 스태틱변수 {
  public static void main(String[] args) {
      Smurfs s1 = new Smurfs("영희");
      Smurfs s2 = new Smurfs("철수", 22);
      s2.age++; // s2의 age가 1가 증가하여 23이 됨

      System.out.println(s1); // 영희 21
      System.out.println(s2); // 철수 23
      System.out.println(Smurfs.howmany); // 2
  }
}
