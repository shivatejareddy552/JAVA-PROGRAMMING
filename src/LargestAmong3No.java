import java.util.Scanner;

public class LargestAmong3No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the First no:");
        int num1=sc.nextInt();
        System.out.println("enter the second no:");
        int num2= sc.nextInt();

        System.out.println("enter the third no:");
        int num3= sc.nextInt();

       /* if(num1>num2&&num1>num3){
            System.out.println("num1 is largest:"+num1);
        } else if (num2>num1&&num2>num3) {
            System.out.println("num2 is largest:"+num2);

        }else{
            System.out.println("num3 is largest:"+num3);
*/
//    }

      /*  int largest1=num1>num2?num1:num2;
        int largest2=num3>largest1?num3:largest1;
        System.out.println(largest2);*/

        int largest=num3>(num1>num2?num1:num2)?num3:num1>num2?num1:num2;
        System.out.println(largest);




    }
}
