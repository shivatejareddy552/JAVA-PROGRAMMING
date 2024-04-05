import java.util.Scanner;

public class PalindromNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no:");
        int num=sc.nextInt();
        int org_No=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_No==rev){
            System.out.println("number is palindrom:"+org_No);
        }
        else{
            System.out.println("not");
        }
    }

}
