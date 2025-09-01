/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */


abstract class 자동차 {
  public abstract void 운전();
  public abstract void 멈춤();

  // 상속받아서 override 하는건 자유인 메서드(abstract가 없음)
  public void 시동끄기(){};
  public void 시동걸기(){
    System.out.println("시동을 켭니다.");
  }

  // 템플릿 메서드
  // 재정의 할 수 없게 final 메서드 사용
  final public void run() {
    시동걸기();
    운전();
    멈춤();
    시동끄기();
  }
}

class 수동차 extends 자동차 {
  @Override
  public void 운전() {
    System.out.println("운전자가 주행합니다.");
  }

  @Override
  public void 멈춤() {
    System.out.println("운전자가 멈춥니다.");
  }
}

public class 템플릿메서드 {
  public static void main(String[] args) {
    수동차 myCar = new 수동차();
    myCar.run();

    // 출력: 
    // 시동을 켭니다.
    // 운전자가 주행합니다.
    // 운전자가 멈춥니다.
  }
}
