package class13;
/* Create a String that should be a combination of letters, numbers and special characters. Find out
how many alphabets are there

 */
public class Task3 {
    public static void main(String[] args) {
        String str="fdjgHKGJdhf2346534!@#";
        System.out.println(str.replaceAll("[^a-zA-Z]", "").length());



    }
}
