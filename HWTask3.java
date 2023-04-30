package class13;

public class HWTask3 {
    /*How would you swap  2 strings without a temporary variable?

     */

    public static void main(String[] args) {
        String s1="Luck";
        String s2="Good";
        s1=s1+s2;
        s2=s1.substring(0,(s1.length()-s2.length()));
        s1=s1.substring(s2.length());
        System.out.println(s1+s2);

    }
}
