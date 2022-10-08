public class Q5 {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
    public static String compress(String str) {
        int count =1;
        StringBuilder output= new StringBuilder("");
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                output.append(str.charAt(i-1));
                output.append(count);
                count=1;
            }
        }
        if(str.charAt(str.length()-1) == str.charAt(str.length()-2)){
            count++;
        }else{
            output.append(str.charAt(str.length()-2));
            output.append(count);
            count=1;
        }
        output.append(str.charAt(str.length() - 1));
        output.append(count);
        return output.toString();
    }
}
