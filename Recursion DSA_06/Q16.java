public class Q16 {
    public static void towerOfHenoi(int n , String src, String helper , String dest) {
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHenoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHenoi(n-1, helper, src, dest);
        
    }
    public static void main(String[] args) {
        int n=2;
        towerOfHenoi(n, "S", "H", "D");
    }
}
