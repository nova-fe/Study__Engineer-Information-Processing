/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
interface 학생 {
  public void 공부한다();
  public void 시험본다();
}
class 스폰지밥 implements 학생 {
  @Override
  public void 공부한다() {
    System.out.println("스폰지밥이 공부한다.");
  }
  @Override
  public void 시험본다() {
    System.out.println("스폰지밥이 시험본다.");
  }
}
public class InterfaceEx1 {
  public static void main(String[] args) {
    스폰지밥 s = new 스폰지밥();
    s.공부한다();
    s.시험본다();
  }
}
