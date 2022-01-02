package java.basic.bt2;

public class NhanVien extends Person {
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private float luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String phongBan, float heSoLuong, int thamNien, float luongCoBan) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double tinhLuongThucLinh() {
        return luongCoBan*heSoLuong*(1 + thamNien/100);
    }

    @Override
    public void print() {
        super.print();

        System.out.print("\tPhòng ban: " + phongBan + "\tThâm niên: " + thamNien + "\tHệ số lương: " + heSoLuong +
                "\tLương cơ bản: " + luongCoBan + "\tLương thực lĩnh: " + tinhLuongThucLinh());
    }

    @Override
    public String toString() {
        return super.toString() + "$" + phongBan + "$" + thamNien + "$" + heSoLuong + "$" + luongCoBan;
    }
}
