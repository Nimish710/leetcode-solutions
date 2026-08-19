class Solution {
    public int compress(char[] chars) {

        int k = 0;

        for (int i = 0; i < chars.length; i++) {

            int count = 1;

            // Count consecutive characters
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            // Write the character
            chars[k] = chars[i];
            k++;

            // Write count if greater than 1
            if (count > 1) {
                String str = String.valueOf(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[k] = str.charAt(j);
                    k++;
                }
            }
        }

        return k;
    }
}