import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int a[]={4,2,10,5,3};
        System.out.println("Array before  sorting :"+ Arrays.toString(a));
        int n=a.length;
        for(int i=0;i<n-1;i++) //for no of passes
        {
            for(int j=0;j<n-1;j++)// for iterations
            {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        System.out.println("Arrays After sorting:"+Arrays.toString(a));

    }
}
