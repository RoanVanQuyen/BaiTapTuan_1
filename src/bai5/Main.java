package bai5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]){
        int a[] = new int[6] ;
        Scanner Ip = new Scanner(System.in) ;
        int soLonNhat = -999999999 ;
        int soLonThuHai = -99999999 ;
        int indLN = -1 ;
        for(int i = 0 ; i < 5 ; i++){
            a[i] = Ip.nextInt() ;
           if(a[i] > soLonNhat) {
               soLonNhat = a[i] ;
               indLN = i;
           }
        }
        for(int i = 0 ; i < 5 ; i++){
            if(a[i] > soLonThuHai && i != indLN){
                soLonThuHai = a[i] ;
            }
        }
        System.out.println("So Lon Nhat: " + soLonNhat);
        System.out.println("So Lon Thu Hai: " + soLonThuHai);
    }
}
