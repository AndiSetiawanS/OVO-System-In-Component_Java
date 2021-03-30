import java.util.Scanner;
public class FirstMedia implements Bayar {
    public void MemprosesData() {
        int nomor = 0;
        Scanner NomorPelanggan = new Scanner(System.in);

        System.out.print("Masukkan Nomor Pelanggan : ");
        nomor = NomorPelanggan.nextInt();

        if(nomor != 0){
            System.out.println("Pembayaran Internet & TV Kabel First Media Berhasil dilakukan");
        } else {
        System.out.println("Nomor Pelanggan Yang Anda Masukkan Salah");
        }
    }
}