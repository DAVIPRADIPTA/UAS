import java.util.ArrayList;
import java.util.Scanner;

public class uas {
    public static void main(String[] args) {

        ArrayList<String> lantai1 = new ArrayList<>();
        ArrayList<String> lantai2 = new ArrayList<>();
        ArrayList<String> lantai3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Silahkan masukan kapasitas mesin kendaraan anda (dalam cc): ");
            int kapasitasMesin = scanner.nextInt();
            scanner.nextLine();

            String kendaraan = "Kapasitas mesin kendaraan " + kapasitasMesin + " cc";

            if (kapasitasMesin >= 1000 && kapasitasMesin <= 1200) {
                lantai3.add(kendaraan);
                System.out.println("Kendaraan akan ditempatkan di lantai 3");
            } else if (kapasitasMesin >= 1500 && kapasitasMesin <= 2000) {
                lantai2.add(kendaraan);
                System.out.println("Kendaraan akan ditempatkan di lantai 2");
            } else if (kapasitasMesin >= 2500) {
                lantai1.add(kendaraan);
                System.out.println("Kendaraan akan ditempatkan di lantai 1");
            } else {
                System.out.println("Kendaraan anda tidak memenuhi ketentuan.");
            }

            System.out.print("Apakah ada kendaraan lain? (ya/tidak): ");
            String jawaban = scanner.nextLine();

            if (jawaban.equalsIgnoreCase("tidak")) {
                break;
            }
        }


        System.out.println("Data Kendaraan di Lantai 1:");
        for (String kendaraan : lantai1) {
            System.out.println(kendaraan);
        }

        System.out.println("Data Kendaraan di Lantai 2:");
        for (String kendaraan : lantai2) {
            System.out.println(kendaraan);
        }

        System.out.println("Data Kendaraan di Lantai 3:");
        for (String kendaraan : lantai3) {
            System.out.println(kendaraan);
        }

        scanner.close();
    }
}
