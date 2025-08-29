/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class 할머니 {
  할머니(String name) {
    System.out.printf("난 %s 할머니야\n", name);
  }

  할머니() {
    System.out.println("난 할머니");
  }
}
class 엄마 extends 할머니 {
  엄마() {
    super("옥순");  // 부모 생성자 중에서 어떤 것을 호출할지 지정 가능
    // 할머니(String name)이 호출됨
    System.out.println("난 엄마");
  }
}
class 나 extends 엄마 {
  나() {
    System.out.println("난 나야");
  } 
}
public class 상속에서생성자2 {
  public static void main(String[] args) {
    나 me = new 나();
  }
}
