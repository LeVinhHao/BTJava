package baitap;

import java.util.Scanner;

public class cau13 {
    public void cau13(){
        int n;
        double giaTriTB=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử của mảng");
            n=sc.nextInt();
        }while (n<0);

        int a[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }
        System.out.println("Mảng vừa nhập:");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]="+ a[i]);
        }

        for(int i=0;i<n;i++){
            giaTriTB+=a[i];
        }

        System.out.println("Giá trị trung bình các số trong mảng:" +giaTriTB/n);

        int max=0;
        for(int i= 0;i<n;i++){
                if(a[i]>max){
                    max=a[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng:" +max);
        int min=a[0];
        for(int i= 0;i<n;i++){
            if(a[i]<=min){
                min=a[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng:" +min);

        int minAm=a[0];
        for(int i= 0;i<n;i++){
            if(a[i]<minAm&&a[i]<0){
                minAm=a[i];
            }
        }
        if(minAm<0) {
            System.out.println("Giá trị âm nhỏ nhất trong mảng:" + minAm);
        }else {
            System.out.println("Không có giá trị âm nhỏ nhất trong mảng");
        }

        int maxAm=min;
        for(int i= 0;i<n;i++){
            if(a[i]<0){
                if (a[i] > maxAm) {
                    maxAm = a[i];
                }
            }
        }
        if(maxAm<0) {
            System.out.println("Giá trị âm lớn nhất trong mảng:" + maxAm);
        }else {
            System.out.println("Không có giá trị âm lớn nhất trong mảng");
        }


        int minDuong=-1;
        for(int i= 0;i<n;i++){
            if(a[i]>0) {
                if (a[i] < minDuong || minDuong == -1) {
                    minDuong = a[i];
                }
            }
        }
        if(minDuong>0) {
            System.out.println("Giá trị dương nhỏ nhất trong mảng:" + minDuong);
        }else {
            System.out.println("Không có giá trị dương nhỏ nhất trong mảng");
        }

        int maxDuong=a[0];
        for(int i= 0;i<n;i++){
            if(a[i]>maxDuong&&a[i]>0){
                maxDuong=a[i];
            }
        }
        if(maxDuong>0) {
            System.out.println("Giá trị dương lớn nhất trong mảng:" + maxDuong);
        }else {
            System.out.println("Không có giá trị dương lớn nhất trong mảng");
        }
        System.out.println("Các phần tử chẵn trong mảng:");
        for (int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.println(a[i] +" ");
            }
        }
        System.out.println("Các phần tử lẻ trong mảng:");
        for (int i=0;i<n;i++){
            if(a[i]%2!=0){
                System.out.println(a[i] +" ");
            }
        }
    }
}
