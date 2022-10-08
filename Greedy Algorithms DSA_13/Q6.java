import java.util.*;
//  this code isn't right  
public class Q6 {
    static class Job {
        int id;
        int profit;
        int deadline;

        public Job(int i, int p, int d) {
            id = i;
            profit = p;
            deadline = d;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{ 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 }};
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs,(a,b) -> (b.profit - a.profit)); // decending order sort
        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                ans.add(curr.id);
                time++;
            }
        }
        // print ans
        System.out.println("Maximum job " + ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
