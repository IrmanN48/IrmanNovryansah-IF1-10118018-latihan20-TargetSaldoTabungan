/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan20.targetsaldotabungan;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program :Program ini untuk menampilkan saldo yang berkelipatan 
 *                     sesuai dengan target yang dituju.
 */
public class Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //Deklarasi variable
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double target = 6000000;
        int i = 1;
        
        //proses dan output
        do {
            saldoAwal = (saldoAwal * bunga) + saldoAwal;
            System.out.println("Saldo di bulan ke-"+i+" Rp."+saldoAwal);
            i++;
        } while (saldoAwal <= target); 
        
    }
}
