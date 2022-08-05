import java.util.Random;
import java.util.regex.Pattern;

public class bkt {
    public static void main(String[] args) {
        // // bài 1
        // in ra hình vuông
        String str = "* ";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(str);
            }
            System.out.println("");
        }
        // in ra hình tam giác
        System.out.println("hình tam giác");
        String str2 = "*";
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(str2);

            }
            System.out.println("");
        }
        System.out.println("\n");
        // bai 2
        int dem2 = 0;
        String chuoiB2 = "You only live once, but if you do it right, once is enough";
        System.out.println("tổng số kí tự là :" + chuoiB2.length());
        for (int i = 0; i < chuoiB2.length(); i++) {
            if (text.charAt(i) == 'o') {
                System.out.println("vị trí cua o" + i);
                dem2 = dem2++;

            }
        }
        System.out.println("số lần suất hiện  của kí tự o là :" + dem2);

        // bài 3
        // lấy số ngẫu nhiên nhỏ hơn 100
        Random random = new Random();
        int soNgauNhien = random.nextInt(100);
        // check số ngẫu nhiên có pải số nguyên tố không
        if (checksoNT(soNgauNhien)) {
            System.out.println("số ngẫu nhiên " + soNgauNhien + "là số nguyên tố\n");
        } else {
            System.out.println("số ngẫu nhiên " + soNgauNhien + " không là số nguyên tố\n");

        }

        // bài 4

        // liệt kê số nguyên tố nhỏ hơn 10
        int dem = 0;
        System.out.println("số nt nhỏ hơn 10:");
        for (int i = 0; i < 100; i++) {
            if (checksoNT(i)) {

                if (i < 10) {
                    System.out.print(i + " ");
                }

            }
        }
        // in ra 10 số nguyên tố đàu tiên
        System.out.println("\n10 số nt đầu tiên là ");
        for (int i = 0; i < 100; i++) {
            if (checksoNT(i)) {
                dem++;
                if (dem == 10) {
                    break;
                }
                System.out.print(i + " ");

            }
        }

        // bài 6
        String regexSDT = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        String sdt = "0384354307";
        System.out.println("\n" + sdt + ":" + sdt.matches(regexSDT));
        System.out.println("\n" + sdt + ":" + Pattern.matches(regexSDT, sdt));

    }

    // check số nguyên tố
    static boolean checksoNT(int n) {
        if (n < 2) {
            return false;

        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
