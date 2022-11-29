package baitap;

import java.util.Scanner;

public class cau19 {
    public void cau19(){
        int kt;
        double a,b,c;
        double x,x1,x2;
        double delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 để giải phương trình bậc 1, nhập 2 để giải phương trình bậc 2");
        kt= sc.nextInt();
        if(kt==1){
            do {
                System.out.print("Nhập a: ");
                a=sc.nextInt();
                System.out.print("Nhập b: ");
                b=sc.nextInt();
            }while (a<0);
            x=(double) -(b/a);
            System.out.println("Phương trình "+a+"x "+"+ "+b+"="+" 0 có nghiệm x= "+x);

        }else {
            System.out.print("Nhập a: ");
            a=sc.nextInt();
            System.out.print("Nhập b: ");
            b=sc.nextInt();
            System.out.print("Nhập c: ");
            c=sc.nextInt();
            delta= Math.pow(b,2)-(4*a*c);
            if(delta>0){
                System.out.println("Phương trình có hai nghiệm phân biệt: ");
                x1=((-b)+(Math.sqrt(delta)))/(2*a);
                x2=((-b)-(Math.sqrt(delta)))/(2*a);
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            } else if (delta==0) {
                x1=-b/(2*a);
                x2=x1;
                System.out.println("Phương trình có nghiệm kép: x1=x2="+x1);
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
