public class reverseStringLeetCode {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start += 1;
            end -= 1;
        }
    }

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        reverseString(array);
        System.out.println(array);
    }
}
