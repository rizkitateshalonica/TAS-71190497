package com.uas.perawatan;

import java.util.Scanner;

public class Pendaftaran extends DAO{
    private int idPendaftaran;
    private String nama;

    public Pendaftaran(int idPendaftaran, String nama) {
        this.idPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdPendaftaran() {
        return idPendaftaran;
    }

    public void setIdPendaftaran(int idPendaftaran) {
        this.idPendaftaran = idPendaftaran;
    }

    public void mengaturDaftar(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Daftar daftar) {
        if(!pengunjung.getStatus()) {
            daftar.setStatusDaftar(true);
            daftar.setPengunjung(pengunjung);
            daftar.setPemeriksa(pemeriksa);
            daftar.setPendaftaran(this);
        }
    }

    public Pengunjung registrasi(){
        Scanner inputAngka = new Scanner(System.in);
        System.out.print("Masukan RM baru : ");
        int rmBaru = inputAngka.nextInt();

        Scanner inputString = new Scanner(System.in);
        System.out.print("Masukan nama Anda : ");
        String nama = inputString.nextLine();

        System.out.print("Masukan usia Anda : ");
        int usia = inputAngka.nextInt();

        System.out.print("Masukan alamat Anda : ");
        String alamat = inputString.nextLine();

        System.out.print("Masukkan penyakit Anda : ");
        String penyakit = inputString.nextLine();

        Pengunjung pengunjung = new Pengunjung(rmBaru, nama, usia, alamat, penyakit);
        super.inputPengunjung(pengunjung);
        System.out.println("Data Pengunjung Berhasil Disimpan!");
        System.out.println("====================PROSES REGISTRASI BERHASIL====================");
        return pengunjung;
    }
}
