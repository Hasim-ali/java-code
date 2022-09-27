public class recmovetoendstring {
    public static void move(String str, int ind, int count, String newString) {

        if (ind == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char current = str.charAt(ind);
        if (current == 'x') {
            count++;
            move(str, ind + 1, count, newString);
        } else {
            newString += current;
            move(str, ind + 1, count, newString);
        }
    }

    public static void main(String[] args){
        String str="axbcxxd";
        move(str, 0, 0, "");
    }
}
