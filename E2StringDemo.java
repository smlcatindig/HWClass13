package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="ksfksdjkfsdkjfkdshDHFHFTYJGHBM123465#@$^%&";
        System.out.println(str.replaceAll("[^a-z]", "")); // not operator ^
        // do not replace lower case letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[^a-z0-9]", ""));

        System.out.println(str.replaceAll("[Dn3]", ""));
        System.out.println(str.replaceAll("[A-Z]", "\\$"));
        System.out.println(str.replaceAll("", "\\$"));
    }
}
