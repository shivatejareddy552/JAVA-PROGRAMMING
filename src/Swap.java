public class Swap {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("before swapping values"+a+ " "+b);
      /*  int t=a;
        a=b;
        b=t;*/
//        logic 2
     /*   a=a+b;
        b=a-b;
        a=a-b;*/
//        logic 3
      /*  a=a*b;
        b=a/b;
        a=a/b;*/
//        logic 4
        b=a+b-(a=b);
        System.out.println("after swapping values"+a+" "+b);
    }
}
