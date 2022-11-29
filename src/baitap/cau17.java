package baitap;

import java.util.Scanner;

public class cau17 {
    public void cau17(){
        int ran= (int)((Math.random()) * ((1000 -1) + 1)) + 1;
//        System.out.println(ran);
        int num;
        Scanner sc = new Scanner(System.in);


        System.out.println("Game đoán chữ");

        do {
            System.out.println("Nhập 1 số bất kỳ");
            num= sc.nextInt();
            if(num<ran){
                System.out.println("Số bạn nhập vào nhỏ hơn số của chương trình");
            }else if(num>ran){
                System.out.println("Số bạn nhập vào lớn hơn số của chương trình");
            }else {
                System.out.println("Bạn đã đoán đúng");
            }

        }while(num<ran||num>ran);

    }
}
