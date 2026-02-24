package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening{
    public RekeningSyariah(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningSyariah(Nasabah nasabah) {
        super(nasabah);
    }

    @Override
    public void penarikan(int jumlah) {
        int total;
        if(jumlah > 100000){
            total = jumlah + 1000;
        } else {
            total = jumlah;
        }
        super.penarikan(total);
    }

    public void sedekah(int jumlah){
        if(jumlah > 0){
            super.penarikan(jumlah);
        }
    }

}
