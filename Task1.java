package class13;
/* create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characteristics,
print the character in the middle of the String.
For example String str=hello =>l

 */
public class Task1 {
    public static void main(String[] args) {
        // String str=new String("Java");
        String str = "Suzanne";

        if (!str.isBlank() && str.length()%2!=0 && str.length()>=3){
            int middleIndex=str.length()/2;
            char middleChar=str.charAt(middleIndex);
            System.out.println(middleChar);
        }
    }
}
