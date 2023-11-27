package Test;

public class question7 {
    public static String reverseChar(String str){
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start<end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String test1 = "abba";
        System.out.println(reverseChar(test1));
        if (reverseChar(test1).equals(test1)){
            System.out.println("palendrom");
        }else {
            System.out.println("non");
        }
    }
}
