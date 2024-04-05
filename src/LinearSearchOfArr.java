public class LinearSearchOfArr {
    public static void main(String[] args){
        int a[]={10,20,40,50,30};
        int Sea_Ele=50;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==Sea_Ele){
                System.out.println("req element is found at:"+i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("not found");
        }
    }
}
