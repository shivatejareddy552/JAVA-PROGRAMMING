import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.lang.*;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();/*
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;*/

      /*  StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();*/
        StringBuilder sb1=new StringBuilder();
        sb1.append(num);
        StringBuilder rev=sb1.reverse();

        System.out.println("revrese value:"+rev);
    }
}

