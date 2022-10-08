import java.util.Arrays;
public class Q7 {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
// convrt to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
// length are same 
        if(str1.length() == str2.length()){
            //convert string into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
// short the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
// if the shorted char array are same then strings is anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagram each other");
            }else{
                System.out.println(str1 + " and " + str2 + " are not anagram each other");
            }
        }else{
            // length is not equal then
            System.out.println(str1+ " and "+ str2 + " are not anagrams each other");
        }
    }
}
