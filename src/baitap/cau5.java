package baitap;

import java.util.Scanner;

public class cau5 {
    public void cau5() {
        double xA, yA, xB, yB;
        double AB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ điểm A(xA,yA):");

        System.out.print("xA: ");
        xA=sc.nextDouble();
        System.out.print("yA:");
        yA=sc.nextDouble();

        System.out.println("Nhập tọa độ điểm B(xB,yB):");
        System.out.print("xB: ");
        xB=sc.nextDouble();
        System.out.print("yB:");
        yB=sc.nextDouble();

        AB=Math.sqrt( Math.pow((xB-xA),2) + Math.pow((yB-yA),2) );
        System.out.println(AB);
    }
}
