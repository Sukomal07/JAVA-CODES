
// import java.util.*;
public class Basic {
    public static void main(String[] args) {
        // char arr[] = {'a', 'b','c','d'};
        // String str ="abcd";
        // String str1 = new String("xyz");
        // //String are IMMUTABLE
        // Scanner sc= new Scanner(System.in);
        // String name;
        // // name = sc.next();
        // name = sc.nextLine();
        // sc.close();
        // System.out.println(name);

        // String fullName = "Sukomal Dutta";
        // System.out.println(fullName.length());

        //concatenation
        String firstName = "Sukomal";
        String lastName = " Dutta";
        String fullName = firstName + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));
        printLatters(fullName);
    }
    public static void printLatters(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
