class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            // Find the beginning of the word
            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Add the word
            sb.append(s.substring(i + 1, end + 1));
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}