public class binaryAdd {

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);

        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(addBinary("1010", "1011"));
        System.out.println(0 + '1' + '1');

    }
}
