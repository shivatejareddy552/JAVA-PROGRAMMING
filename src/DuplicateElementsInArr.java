import java.util.HashSet;

public class DuplicateElementsInArr {
    public static void main(String[] args) {
       /* String arr[]={"java","c","c++","python","java"};
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("found duplicate elements:"+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("No Duplicate Elements is found");
        }*/
//  Approch:-2
        String arr[]={"java","c","c++","python","java"};
        HashSet<String> lang=new HashSet();
       /* System.out.println(lang.add("java"));
        System.out.println( lang.add("python"));
        System.out.println( lang.add("java"));*/
        boolean flag=false;
        for(String l:arr){
            if(lang.add(l)==false){
                System.out.println("found duplicate Elements:"+l);
                flag=true;
            }


        }
        if(flag==false){
            System.out.println("no duplicate elements ");
        }

    }

}
