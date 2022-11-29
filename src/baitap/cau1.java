package baitap;

import java.util.Scanner;

public class cau1 {

  public void cau1() {
      int gioBd;
      int gioKt;
      int nuoc;
      int soGio;
      int tong;
      double tienGio;
      double giamGia=0;
      Scanner scanner = new Scanner(System.in);
      do {
          System.out.print("Nhập giờ bắt đầu: ");
          gioBd = scanner.nextInt();
      } while (gioBd < 9 || gioBd>24);
      do {
          System.out.print("Nhập giờ kết thúc: ");
          gioKt = scanner.nextInt();
      } while (gioKt < 10|| gioKt>24);
      System.out.print("Nhập số chai nước: ");
      nuoc = scanner.nextInt();
      nuoc *= 10000;
      soGio = gioKt - gioBd;

      if (soGio > 3) {
          tienGio = 90000  + (soGio - 3) * 90000 * 0.3;
      } else {
          tienGio = soGio * 30000 ;
      }
      tong=(int)tienGio+nuoc;
      if (gioBd >= 9 && gioKt <= 17) {
          giamGia = tong * 0.2;
      }

      System.out.println("Tiền giờ: " + tienGio);
      System.out.println("Nước: " + nuoc);
      System.out.println("Tổng: " + tong);
      System.out.println("Giảm giá: " + giamGia);
      System.out.println("Tổng thanh toán: " + String.valueOf(tong - giamGia));
  }
}
