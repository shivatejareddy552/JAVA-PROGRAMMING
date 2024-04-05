public class MissingElementsInArr {
    public static void main(String[] args) {
        int a[]={1,2,3,5};
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("sum of missing arr elements:"+sum1);
        int sum2=0;

        for(int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("sum of sum2 elements:"+sum2);
        System.out.println("missing elements:"+(sum2-sum1));
    }

}
