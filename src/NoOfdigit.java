public class NoOfdigit {
    public static void main(String[] args) {
        int num=123456;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("the no of digits are:"+count);
    }
}
