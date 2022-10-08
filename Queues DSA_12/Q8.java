import java.util.*;
public class Q8 {
    public static void reverseKthElement(Queue<Integer> q , int k){
        Stack<Integer> s = new Stack<>();
        for(int i = 1; i<= k; i++ ){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        int n = q.size();
        for(int i = 1 ; i<= n-k; i++){
            int x = q.peek();
            q.remove();
            q.add(x);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        reverseKthElement(q, 5);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
