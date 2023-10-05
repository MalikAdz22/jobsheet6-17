import java.util.Scanner;

public class Pemilihan2Percobaan1_17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukan Tahun : ");
        tahun = input17.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun " + tahun + " adalah tahun Kabisat");
                } else {
                    System.out.println("Tahun " + tahun + " bukan tahun Kabisat");

                }
            }
        } else {
            System.out.println("Tahun " + tahun + "bukan tahun Kabisat");
        }
    }
}
