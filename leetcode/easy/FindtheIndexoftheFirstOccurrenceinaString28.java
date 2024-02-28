package easy;
/**
 * FindtheIndexoftheFirstOccurrenceinaString28
 */
public class FindtheIndexoftheFirstOccurrenceinaString28 {

    public static int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}