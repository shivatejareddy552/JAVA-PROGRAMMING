public class FactorialNo {
    public static void main(String[] args) {
        int num=4;
        long fac=1;
        for(int i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
