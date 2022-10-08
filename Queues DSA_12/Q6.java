import java.util.*;

public class Q6 {
    static class job {
        char jobId;
        int deadline;
        int profit;

        job(char jobId, int deadline, int profit) {
            this.jobId = jobId;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<job> arr) {
        int n = arr.size();
        Collections.sort(arr, (a,b) -> {
            return a.deadline - b.deadline;
        });
        ArrayList<job> result = new ArrayList<>();
        PriorityQueue<job> maxHeap = new PriorityQueue<>((a,b) -> {
            return b.profit - a.profit;
        });
        for (int i = n - 1; i > -1; i--) {
            int slotAvailable;
            if (i == 0) {
                slotAvailable = arr.get(i).deadline;
            } else {
                slotAvailable = arr.get(i).deadline - arr.get(i - 1).deadline;
            }
            maxHeap.add(arr.get(i));
            while (slotAvailable > 0 && maxHeap.size() > 0) {
                job J = maxHeap.remove();
                slotAvailable--;
                result.add(J);
            }
        }
        Collections.sort(result, (a, b) -> {
            return a.deadline - b.deadline;
        });
        for (job J : result) {
            System.out.print(J.jobId + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<job> arr = new ArrayList<>();
        arr.add(new job('a', 4, 20));
        arr.add(new job('b', 1, 10));
        arr.add(new job('c', 1, 40));
        arr.add(new job('d', 1, 30));
        // arr.add(new job('e', 3, 50));
        // arr.add(new job('f', 1, 30));
        printJobScheduling(arr);
    }
}
