public class linearSearch {
    public static void main(String[] args) {
        int numbers[] = {4,5,2,7,3,9,4,10,85,8};
        int key=10;

        int index = Linear(numbers, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key is at index " + index);
        }
    }
    public static  int  Linear(int numbers[], int key) {
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}
