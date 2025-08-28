/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class 복소수 {
  private int a, b;
  private 복소수(int i, int j) {
    this.a = i;
    this.b = j;
  }
  
  private 복소수(int i) {
    this(i, i);
  }

  private 복소수() {
    this(0);
  }

  @Override
  public String toString() {
    return this.a + " + " + this.b + "i";
  }

  public static void main(String[] args) {
    복소수 c1 = new 복소수(2, 3);
    복소수 c2 = new 복소수(2);
    복소수 c3 = new 복소수();

    System.out.println(c1); // 2 + 3i
    System.out.println(c2); // 2 + 2i
    System.out.println(c3); // 0 + 0i
  }
}
