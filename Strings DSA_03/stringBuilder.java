

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for(char ch='a'; ch<='z'; ch++){
            //add one by one
            sb.append(ch);
        }
        // Time complexity  for this code - O(26)
        //  if the oparation is+= for a string then time complexity is O(n^2) , n is length of the string which run 26 times for 26 alphabate
        System.out.println(sb);
    }
}
