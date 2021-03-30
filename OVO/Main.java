import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        FirstMedia TvFirstMedia = new FirstMedia();
        Transvision TvTransvision = new Transvision();
        MncVision TvMncVision = new MncVision();

        Ovo OvoFirstMedia = new Ovo();
        Ovo OvoTransvision = new Ovo();
        Ovo OvoMncVision = new Ovo();

        Scanner tvBerlangganan = new Scanner(System.in);
        System.out.println("Pembayaran Internet & TV Kabel");
        System.out.println("\t1. First Media");
        System.out.println("\t2. MNC Vision");
        System.out.println("\t3. Transvision\n");
        System.out.print("Pilihan : ");

        int pilihan = tvBerlangganan.nextInt();
        switch (pilihan) {
            case 1:
                OvoFirstMedia.InsertTo(TvFirstMedia);
                OvoFirstMedia.Membayar();
                break;
            
            case 2:
                OvoMncVision.InsertTo(TvMncVision);
                OvoMncVision.Membayar();
                break;

            case 3:
                OvoTransvision.InsertTo(TvTransvision);
                OvoTransvision.Membayar();
                break;
        
            default:
                System.out.println("\nPilihan Yang Anda Masukkan Salah\n");
                break;
        }
    }
}