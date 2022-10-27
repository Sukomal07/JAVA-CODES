import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadder {
    static class Pair {
        String first;
        int count;

        Pair(String first, int count) {
            this.first = first;
            this.count = count;
        }
    }

    public static int ladderLangth(String wordList[], String start, String end) { // O(n*word.length *26* logn)
        // first make a queue
        Queue<Pair> q = new LinkedList<>();
        // bfs traversal pushing word into Queue first push start and step 1 into queue 
        q.add(new Pair(start, 1));
        // push all word of wordlist into a set
        HashSet<String> st = new HashSet<>();
        int len = wordList.length;
        for (int i = 0; i < len; i++) {
            // add word one by one into set
            st.add(wordList[i]);
        }
        // remove word from set to check
        st.remove(start);
        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().count;
            // remove word and step to check
            q.remove();
            // we return the steps as soon as end word is found
            if (word.equals(end) == true) {
                return steps;
            }
            // now replace is character with char from 'a-z' then check if the word exists
            // in the wordlist
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char replaceChar[] = word.toCharArray();
                    replaceChar[i] = ch;
                    String replaceWord = new String(replaceChar);
                    // check if it is exists in the set push it into Queue
                    if (st.contains(replaceWord) == true) {
                        st.remove(replaceWord);
                        q.add(new Pair(replaceWord, steps + 1));
                    }
                }
            }
        }
        // if there is no transformation possible 
        return 0;
    }

    public static void main(String[] args) {
        String wordList[] = {"poon","plee","same","poie","plea","plie","poin"};
        String start = "toon" , end = "plea";
        int ans = WordLadder.ladderLangth(wordList, start, end);
        System.out.println(ans);
    }
}
