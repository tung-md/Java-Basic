package java.basic.bt1;

public class Person {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void print() {
        System.out.print("Ho ten: " + hoTen + "\tNgay sinh: " + ngaySinh + "\tGioi tinh: " + gioiTinh + "\tDia chi: " + diaChi);
    }

    @Override
    public String toString() {
        return "\n" + hoTen + "$" + ngaySinh + "$" + diaChi + "$" + gioiTinh;
    }
}
