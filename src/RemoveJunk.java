public class RemoveJunk {
    public static void main(String[] args) {
        String s="~!@#$%^&*()_?::<>>> shiva";
      s= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
