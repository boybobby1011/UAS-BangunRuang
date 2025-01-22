import java.util.Scanner;

public class BangunRuangApps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang bangunRuang = new BangunRuang();

        System.out.println("=== Hitung Balok ===");
        System.out.print("Masukkan panjang: ");
        bangunRuang.setPanjang(scanner.nextInt());
        System.out.print("Masukkan lebar: ");
        bangunRuang.setLebar(scanner.nextInt());
        System.out.print("Masukkan tinggi: ");
        bangunRuang.setTinggi(scanner.nextInt());

        System.out.println("Luas Permukaan Balok: " + bangunRuang.luasBalok());
        System.out.println("Volume Balok: " + bangunRuang.volumeBalok());

        System.out.println("\n=== Hitung Bola ===");
        System.out.print("Masukkan diameter: ");
        bangunRuang.setDiameter(scanner.nextInt());

        System.out.println("Luas Permukaan Bola: " + bangunRuang.luasBola());
        System.out.println("Volume Bola: " + bangunRuang.volumeBola());

        scanner.close();
    }
}
