package class13;

public class HWTask1 {
    /* How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

     */
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb = sb.reverse();

            System.out.print(sb+" ");

        }

    }
}