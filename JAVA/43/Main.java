/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class IamSingleton {
  private static IamSingleton i;
  private IamSingleton() { };

  public static IamSingleton getInstance() {
    if (i == null) {
      i = new IamSingleton();
    }
    return i;
  }

  public void showMessage() {
    System.out.println("저는 싱글톤 객체입니다.");
  }
}
public class Main {
  public static void main(String[] args) {
    IamSingleton s1 = IamSingleton.getInstance();
    IamSingleton s2 = IamSingleton.getInstance();
    s1.showMessage();
    s2.showMessage();
  }
}
