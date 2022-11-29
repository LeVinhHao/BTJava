package baitap;

import java.util.Scanner;

public class cau7 {
    public void cau7(){
        int num;
        System.out.println("Nhập vào 1 số tự nhiên:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Ước số của "+num+" là: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }

}
