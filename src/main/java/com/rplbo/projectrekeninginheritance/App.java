package com.rplbo.projectrekeninginheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb1 = new RekeningBisnis(new Nasabah("Anton", "123", "jalan 1"),100000);
        rb1.penyetoran(100000);
        rb1.penarikan(25000);
        System.out.println("Saldo Sekarang: " + rb1.getSaldo());

        RekeningKeluarga rk1 = new RekeningKeluarga(new Nasabah("Jono", "124", "jalan 2"),200000);
        rk1.penyetoran(100000);
        rk1.penarikan(25000);
        System.out.println("Saldo Sekarang: " + rk1.getSaldo());

        RekeningSyariah rs1 = new RekeningSyariah(new Nasabah("Devon", "125", "jalan 3"),50000);
        rs1.penyetoran(150000);
        rs1.penarikan(25000);
        rs1.sedekah(30000);
        System.out.println("Saldo Sekarang: " + rs1.getSaldo());

        RekeningUtama ru1 = new RekeningUtama(new Nasabah("Felix", "126", "jalan 4"),75000);
        ru1.penyetoran(300000);
        ru1.penarikan(35000000);
        System.out.println("Saldo Sekarang: " + ru1.getSaldo());

        RekeningTambahan rt1 = new RekeningTambahan(new Nasabah("Arvin", "127", "jalan 5"),150000);
        rt1.penyetoran(150000);
        rt1.penarikan(600000);
        System.out.println("Saldo Sekarang: " + rt1.getSaldo());
    }
}
