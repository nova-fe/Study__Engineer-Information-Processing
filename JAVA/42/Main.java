/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
// 멀티쓰레드

class sameTime implements Runnable {
  @Override
  public void run() {
    for (int i = 1; i<4; i++) {
      try {
        Thread.sleep(1000);
        System.out.println("나도 같이: " + i );
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
      Thread sameTime = new Thread(new sameTime());
      sameTime.run(); // run 메서드 호출
      for (int i = 1; i<4; i++) {
        try {
          Thread.sleep(1000);
          System.out.println("메인에서: " + i );
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
  }
}
