/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Pasien {

    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    Pasien(String nama) {
        this.nama = nama;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            this.tanggalLahir = tanggalLahir;
            if (tanggalLahir < 32) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Kurang");
            }
        } else {
            throw new Exception("Kelebihan");
        }
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            this.bulanLahir = bulanLahir;
            if (bulanLahir < 13) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Kurang");
            }
        } else {
            throw new Exception("Kelebihan");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
            if (tahunLahir < 2019) {
                this.tahunLahir = tahunLahir;
            } else {
                throw new Exception("Kurang");
            }
        } else {
            throw new Exception("Kelebihan");
        }
    }

    public int getTahunLahir() {
        return tahunLahir;
    }
}
