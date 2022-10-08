public class Q2 {
    public static void main(String[] args) {
        String path ="WNEENESENNN";
        System.out.println(printPath(path));

    }
    public static float printPath(String path) {
        int x=0 , y=0;
        int n = path.length();
        for(int i=0; i<n; i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2+Y2);
    }
}