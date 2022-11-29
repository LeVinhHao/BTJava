package baitap;

import java.util.Scanner;

public class cau6 {
    public void cau6(){
        String str= "";
        System.out.println("Nhập vào 1 chuỗi bất kỳ");
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        StringBuffer SB= new StringBuffer(str);
        System.out.println("Chuỗi sau khi đã đảo ngược");
        System.out.println(SB.reverse());

    }
}
