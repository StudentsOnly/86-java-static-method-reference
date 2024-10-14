class StringUtils {

    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();  // Remove whitespace and lowercase
        int length = cleanStr.length();

         for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}