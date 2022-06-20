package com.uas.perawatan;

public class Perawat {
    private int idPerawat;
    private String nama;

    public Perawat(int idPerawat, String nama) {
        this.idPerawat = idPerawat;
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Daftar daftar) {
        if(daftar.getPengunjung().equals(this)) {
            if(daftar.getPengunjung().equals(pengunjung) && daftar.getStatusDaftar()) {
                daftar.setStatusScreening(true);
            }
        }
        else {
            System.out.println("====================ANDA HARUS MELAKUKAN PROSES PENDAFTATAN TERLEBIH DAHULU DI BAGIAN PELAYANAN====================");
        }
    }
}
