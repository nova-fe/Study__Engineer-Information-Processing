

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class 할머니 {
  할머니() {
    System.out.println("난 할머니");
  }
}

class 엄마 extends 할머니 {
  // super(); 가 생성자 맨 앞에 숨어있음
  엄마() {
    System.out.println("난 엄마");
  }
}

class 나 extends 엄마 {
  // super(); 가 생성자 맨 앞에 숨어있음
  나() {
    System.out.println("난 나야");
  }
}

public class 상속에서생성자 {
  public static void main(String[] args) {
    나 me = new 나();
  }
}

// 출력: suprer(); 가 생성자 맨 앞에 숨어있음. 그러므로, 부모 생성자가 먼저 호출됨
// 난 할머니
// 난 엄마
// 난 나야