class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        // Frequency map for characters in t (using int array for performance)
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int count = t.length(); // Total characters to match

        while (right < s.length()) {
            // If the character at 'right' is needed by 't', decrease 'count'
            if (map[s.charAt(right)] > 0) {
                count--;
            }
            // Always decrease the map value for the character at 'right'
            map[s.charAt(right)]--;
            right++;

            // When all characters are found, try to shrink the window from the left
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                // Move the left pointer
                map[s.charAt(left)]++;
                // If map[char] > 0, it means we now lack a character required by 't'
                if (map[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}