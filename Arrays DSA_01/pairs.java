public class pairs {
    public static void main(String[] args) {
        int numbers[] = {4,8,5,6,7};
        pairsInArray(numbers);
    }
    public static void pairsInArray(int numbers[]) {
        for (int i =0; i<numbers.length; i++) {
            int current = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("{" + current + "," + numbers[j] + " }");
            }
            System.out.println();
        }
    }
}
