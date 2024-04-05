public class SumOfArr {
    public static void main(String[] args) {
        int a[]={2,3,4,6,7,9};
        int sum=0;
        /*for(int i=0;i<=a.length-1;i++){
            sum=sum +a[i];*/
        //enhanced for loop
        for(int value:a){
            sum=sum+value;
        }
        System.out.println(sum);
    }
}
