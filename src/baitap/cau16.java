package baitap;

import java.util.Scanner;

public class cau16 {
    public void cau16(){
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm");
        nam= sc.nextInt();
        if(nam%4==0 || nam%400==0){
            System.out.println("Năm " +nam+" là năm nhuận");
        }else {
            System.out.println("Năm " +nam+" không phải là năm nhuận");
        }
    }
}
