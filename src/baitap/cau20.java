package baitap;

import java.util.Scanner;

public class cau20 {
    public void cau20(){
        Scanner sc = new Scanner(System.in);
        int n;
        int c=0,l=0;
        System.out.println("Nhập số phần tử của mảng");
        n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }
        int aChan[]= new int[n];
        int aLe[]= new int[n];
        for(int i= 0;i<n;i++){
            if(a[i]%2==0){
                aChan[c]=a[i];
                c++;
            }else {
                aLe[l]=a[i];
                l++;
            }
        }

        System.out.println("Mảng chẵn");
        for(int i=0;i<c;i++){

                System.out.println(aChan[i]);

        }
        System.out.println("Mảng lẻ");
        for(int i=0;i<l;i++){

                System.out.println(aLe[i]);

        }
    }

}
