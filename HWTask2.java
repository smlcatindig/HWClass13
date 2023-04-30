package class13;

public class HWTask2 {
    /* Write a code that will take in a String input and check to see if it is a palindrome or not

     */

    boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        boolean isStrPalindrome=false;
        if(str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome=true;
        }
        return isStrPalindrome;

    }
    boolean isPalindromeSB(String str){
        /* new StringBuilder(str) => converts the String to a StringBUilder
        reverse() => it reverses the contents in StringBuilder
        toString() => it converts the StringBuilder back to a String
        equalsIgnoreCase(str) => comparing the reversed String to original one
         */
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        HWTask2 hwtask2=new HWTask2();
        boolean result=hwtask2.isPalindrome("Madam");
        System.out.println(result);
    }
}
