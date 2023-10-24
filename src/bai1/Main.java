package bai1;

public class Main {
    public static int USCLN(int a , int b){
        if(b == 0 ) return a  ;
        else return USCLN(b , a % b) ;
    }
    public static int USCLN(int a , int b , int c){
        return USCLN(USCLN(a , b),c) ;
    }
    public static void main(String[] args){
        int a = 4 , b = 4 , c = 8 ;
        System.out.println(USCLN(a , b , c ));
        System.out.println("boi so chung lon nhat la: " + (a * b * c) / (USCLN(a,b,c)));
    }
}
