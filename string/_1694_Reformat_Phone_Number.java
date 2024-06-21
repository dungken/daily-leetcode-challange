package string;

public class _1694_Reformat_Phone_Number {
    public static String reformatNumber(String number) {
        number = number.replaceAll("[ -]", "");
        //return F(number);
        int n = number.length();

        if (n == 2 || n == 3)
            return number;
        if (n == 4)
            return number.substring(0, 2) + "-" + number.substring(2);

        String result = "";
        int temp = 0;

        while ((n - temp) > 4) {
            result += number.substring(temp, temp+3) + "-";
            temp += 3;
        }

        int k = (n - temp);
        if (k == 2 || k == 3)
            result += number.substring(temp);
        if (k == 4)
            result += number.substring(temp, temp + 2) + "-" + number.substring(temp + 2);
        return result;
    }

    public static String F(String s) {
        int n = s.length();
        if (n == 2 || n == 3)
            return s;
        if (n == 4)
            return s.substring(0, 2) + "-" + s.substring(2);
        return s.substring(0, 3) + "-" + F(s.substring(3));
    }

    public static void main(String[] args) {
        String s = "1234567";
        System.out.println(reformatNumber(s));
    }
}
