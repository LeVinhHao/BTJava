package baitap;

import java.util.Scanner;

public class cau4 {
    public void  cau4(){
        int soDu;
        int n;
        int tong=0;
        System.out.println("Nhập vào số tự nhiên bất kỳ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            soDu=n%10;
            n=n/10;
            tong+=soDu;
        }

        System.out.print("Tổng các chữ số của số tự nhiên: "+tong);
    }
}
