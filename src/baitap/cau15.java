package baitap;

import java.util.Scanner;

public class cau15 {
    public void cau15(){
        String str="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ");
        str=sc.nextLine();
        int strlen= str.length();
        System.out.println("Độ dài của chuỗi là: "+strlen);
        System.out.println("Nhập vào vị trí cần in ký tự");
        int i= sc.nextInt();
        System.out.println(String.valueOf(str.charAt(i)));
        boolean kiemTra =str.contains("abcdef");
        if(kiemTra==true){
            System.out.println("Có xuất hiện chuỗi abcdef trong chuỗi");
        }else {
            System.out.println("Không có xuất hiện chuỗi abcdef trong chuỗi");
        }
    }
}
