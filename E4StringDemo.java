package class13;
// create a String that will hold a sentence. Write a program to get a new String without any spaces.
public class E4StringDemo {
    public static void main(String[] args) {
        String str="Happy Sunday All. Asghar is the best teacher.";
        System.out.println(str.replaceAll(" ",""));
    }
}
