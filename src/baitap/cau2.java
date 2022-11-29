package baitap;

import java.util.Scanner;

public class cau2 {
    public void cau2_1() {
        for(int i = 2;i <9; i++){
            if(i%2==0) {
                for (int j = 2; j < 40; j++) {
                    if (j > 13) {
                        System.out.print("=");
                    } else if (j % 2 != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }else {
                for (int j = 2; j < 39; j++) {
                    if (j > 12) {
                        if(j==13){
                            System.out.print(" ");
                        }
                        System.out.print("=");
                    } else if (j % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
                System.out.println();
        }
        for(int i = 2;i <10; i++) {
            for (int j = 2; j < 40; j++) {
                System.out.print("=");
            }
            System.out.println();
            }
        }

        public void cau2_2(){
        double soThapPhan=0;
        System.out.println("Nhập số hệ cơ số 10");
        Scanner sc = new Scanner(System.in);
        double n= sc.nextDouble();

        int soDu=0;
            System.out.print("Số đã chuyển sang hệ cơ số nhị phân: ");
            for(int i=0;i<6;i++){
                if(n%2==0){
                    soDu=0;
                }else {
                    soDu=1;
                }
                System.out.print(soDu);
                n=Math.floor(n/2);
                soThapPhan= soThapPhan+soDu+n;
            }
            System.out.println();
            System.out.print("Số hệ cơ số thập phân: "+soThapPhan);

        }
}
