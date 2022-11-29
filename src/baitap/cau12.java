package baitap;

import java.util.Scanner;

public class cau12 {
    public void cau12(){
        int num;
        do{
            System.out.println("Nhập số tự nhiên từ 1 đến 9");
            Scanner sc = new Scanner(System.in);
            num= sc.nextInt();
        }while(num<1||num>9);

        for(int i=1;i<=num;i++){
           for(int j=1;j<=num;j++){
               if(i>=j) {
                   System.out.print(j);
               }
           }
           System.out.println();
        }

    }
}
