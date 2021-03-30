/**
 * Sistem pembayaran Internet & TV Kabel menggunakan aplikasi OVO
 *
 * @author (Andi Setiawan Saputra, Nisa Fakhira, Farhan Maulana, Arnensi)
 * @version (01-April-2021)
 */
public class Ovo {
    private Bayar ovo;

    public Ovo() {
        ovo = null; 
    }
    
    public void InsertTo(Bayar TvBerlangganan) {
        ovo = TvBerlangganan;
    }
    
    public void Membayar() {
        if(ovo != null) {
            ovo.MemprosesData();
        }
        else {
            System.out.println("Ovo Yang Anda Miliki Tidak Cukup");
        }
    }   
}