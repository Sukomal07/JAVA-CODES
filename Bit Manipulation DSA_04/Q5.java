public class Q5 {
    public static void main(String[] args) {
        int x=8;
        //We know that to get negative of a number,invert its bits and add 1 to it.
        //-x =~x+1 => -~x= x+1(replacing -~x)
        System.out.println(x +" + 1 is " + -~x);
    }
}
