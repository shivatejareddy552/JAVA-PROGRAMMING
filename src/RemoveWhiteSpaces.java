public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="hai   java    programming";
        System.out.println("before removing whitespaces:"+str);

        str=str.replaceAll("\\s","");
        System.out.println("after removing whitespaces:"+str);
    }
}
