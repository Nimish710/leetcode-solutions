class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);

        int start = 0;

        for (int i = 0; i <= sb.length(); i++) {

            if (i == sb.length() || sb.charAt(i) == ' ') {

                int end = i - 1;

                while (start < end) {
                    char temp = sb.charAt(start);
                    sb.setCharAt(start, sb.charAt(end));
                    sb.setCharAt(end, temp);

                    start++;
                    end--;
                }

                start = i + 1;
            }
        }

        return sb.toString();
    }
}