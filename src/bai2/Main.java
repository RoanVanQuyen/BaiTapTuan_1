package bai2;

public class Main {
    public static void main(String[] args){
        int a = 16 , b = 16 ;
        String ans = "";
        while(a > 0){
            if(b == 16){
                if(a%b == 10) ans =  ans + "A" ;
                else{
                    if(a%b == 11) ans = ans + "B" ;
                    else {
                        if (a % b == 12) ans = ans + "C";
                        else {
                            if(a % b == 13) ans = ans + "D" ;
                            else{
                                if(a % b == 14) ans = ans + "E" ;
                                else{
                                    if(a % b == 15) ans = ans + "F" ;
                                    else{
                                        ans = ans + ((a%b) + ""  );
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                ans = ans + ((a % b) + "");
            }
            a/=b ;
        }
        for(int i = ans.length()-1 ; i >=0 ; i--){
            System.out.print(ans.charAt(i));
        }
    }
}
