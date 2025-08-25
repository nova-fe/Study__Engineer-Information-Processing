/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class Me {
  Me() {
    System.out.println("생성자이기 때문에 자동 출력");
  }

  void Me_method() {
    System.out.println("메서드이기 때문에 호출해야 출력");
  }
}

public class Ex3 {
  public static void main(String[] args) {
      Me who = new Me(); 
      who.Me_method(); 
  }
}
