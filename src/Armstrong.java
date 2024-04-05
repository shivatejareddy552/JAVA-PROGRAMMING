public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int temp=num,rem;
        int sum=0;
        while(num>0){
            rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
        if(temp==sum)
            System.out.println("it is amstrong");
        else
            System.out.println("not amstrong");

    }
}
