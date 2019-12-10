package tranthanh.dmt.listviewrecycle;

import java.io.Serializable;

public class danhba implements Serializable {
    private  String hT;
    private double sdt;

    public danhba(String hT, double sdt) {
        this.hT = hT;
        this.sdt = sdt;
    }

    public String gethT() {
        return hT;
    }

    public void sethT(String hT) {
        this.hT = hT;
    }

    public double getSdt() {
        return sdt;
    }

    public void setSdt(double sdt) {
        this.sdt = sdt;
    }

    public danhba() {
    }
}
