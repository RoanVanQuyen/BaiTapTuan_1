package bai3;

public class Main {
    public static void main(String[] args){
        int a = 64226 ;
        String number = a +"" ;
        int ans = 1;
        for(int i = 0 ; i < number.length() ;i++){
            ans = ans * (Integer.parseInt(number.charAt(i) + "")) ;
        }
        System.out.println(ans);
    }
}
