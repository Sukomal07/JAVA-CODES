import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[50];

        // int numbers[] ={1,2,3};
        // String name[] = {"Sukomal", " sukomal", " sukomal"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        marks[0]=sc.nextInt();
        System.out.println("Enter number : ");
        marks[1]=sc.nextInt();
        System.out.println("Enter number : ");
        marks[2]=sc.nextInt();
        System.out.println("Enter number : ");
        marks[3]=sc.nextInt();
        System.out.println("Enter number : ");
        marks[4]=sc.nextInt();
        sc.close();
        System.out.println("phy " +  marks[0]);
        System.out.println("chem " + marks[1]);
        System.out.println("eng  " + marks[2]);
        System.out.println("math " + marks[3]);
        System.out.println("bio  " + marks[4]);

        int parcentage = (marks[0] + marks[1]+ marks[2] + marks[3]+ marks[4])/5;
        System.out.println("parcentage " + parcentage );
        // for update array
        // marks[2] = marks[2] +30;
        // System.out.println("eng " + marks[2]);
    }

}
