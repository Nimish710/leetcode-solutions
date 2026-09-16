class Solution {
    public String longestCommonPrefix(String[] strs) {
        String preffix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            int j = 0;

            while(j < preffix.length() &&
                  j < strs[i].length() &&
                  preffix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            preffix = preffix.substring(0, j);
        }

        return preffix;
    }
}