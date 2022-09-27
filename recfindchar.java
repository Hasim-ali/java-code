public class recfindchar {
    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        findOcc(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOcc(str, 0, 'a');
    }
}
