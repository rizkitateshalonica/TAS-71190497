package com.uas.perawatan;

public class Pemeriksa {
    private int idPemeriksa;
    private String nama, spesialis, ruangan;

    public Pemeriksa(int idPemeriksa, String nama, String spesialis, String ruangan) {
        this.idPemeriksa = idPemeriksa;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Daftar daftar) {
        if(daftar.getStatusScreening() && daftar.getPemeriksa().equals(this)) {
            if(pengunjung.getLevelPenyakit() == 0) {
                pengunjung.setStatus(true);
            }
            else {
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            }
        }
        else {
            System.out.println("====================ANDA HARUS MELAKUKAN PROSES PENDAFTATAN TERLEBIH DAHULU DI BAGIAN PELAYANAN====================");
        }
    }

    public void cekStatus(Pengunjung pengunjung, Daftar daftar) {
        if(pengunjung.getStatus()) {
            System.out.println("====================SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT====================");
        }
        else {
            System.out.println("====================PASIEN ANDA MASIH SAKIT====================");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public int getIdPemeriksa() {
        return idPemeriksa;
    }

    public void setIdPemeriksa(int idPemeriksa) {
        this.idPemeriksa = idPemeriksa;
    }
}
