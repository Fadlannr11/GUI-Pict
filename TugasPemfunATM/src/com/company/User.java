package com.company;

public class User {
    private String nk;
    private String ATM;
    private String b;
    private String np;
    private String imgname;

    public User() {
    }

    public User(String nk, String ATM, String b, String np, String imgname) {
        this.nk = nk;
        this.ATM = ATM;
        this.b = b;
        this.np = np;
        this.imgname = imgname;
    }

    public String getNk() {
        return nk;
    }

    public void setNk(String nk) {
        this.nk = nk;
    }

    public String getATM() {
        return ATM;
    }

    public void setATM(String ATM) {
        this.ATM = ATM;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    @Override
    public String toString() {
        return ("\nNo Kartu = " + nk + "\nJenis ATM = " + ATM + "\nBank = " + b +
                "\nNama Pemilik = " + np + "\nNama Foto  = " + imgname);
    }
}
