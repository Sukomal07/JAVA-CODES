public class Q14 {
    public static int findlength(String str) {
        if(str.length() == 0 ){
            return 0;
        }
        return findlength(str.substring(1)) +1;
    }
    public static void main(String[] args) {
        String str= "sukomal";
        System.out.println(findlength(str));
    }
}
