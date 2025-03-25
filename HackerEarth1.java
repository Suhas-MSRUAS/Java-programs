import java.io.*;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_ch = br.readLine().split(" ");
        char[] ch = new char[N];
        for (int i_ch = 0; i_ch < arr_ch.length; i_ch++) {
            ch[i_ch] = arr_ch[i_ch].charAt(0);
        }

        String out_ = solve(N, ch);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static String solve(int N, char[] ch) {
        // Initialize the start and end indices of the current substring.
        int start = 0;
        int end = 0;

        // Initialize the maximum length of the longest substring.
        int maxLength = 0;

        // Create a set to store the characters of the current substring.
        Set<Character> seen = new HashSet<>();

        // Traverse the string using the sliding window algorithm.
        while (end < N) {
            // If the current character is not in the set, add it to the set and update the end index of the current substring.
            if (!seen.contains(ch[end])) {
                seen.add(ch[end]);
                end++;

                // Update the maximum length of the longest substring if the current substring is longer.
                maxLength = Math.max(maxLength, end - start);
            } else {
                // If the current character is already in the set, remove the first character of the current substring from the set and update the start index of the current substring.
                seen.remove(ch[start]);
                start++;
            }
        }

        // Return the longest substring.
        return new String(ch, start, maxLength);
    }
}
