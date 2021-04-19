import java.util.Scanner;
public class FirstMedia implements Bayar {
    public void MemprosesData() {
        Scanner NomorPelanggan = new Scanner(System.in);
        String nomor = "12345";

        System.out.print("Masukkan Nomor Pelanggan : ");
        nomor = NomorPelanggan.nextLine();

        if(nomor.equals("12345")){
            System.out.println("Pembayaran Internet & TV Kabel First Media Berhasil dilakukan");
        } else {
        System.out.println("Nomor Pelanggan Yang Anda Masukkan Salah");
        }
    }
}
