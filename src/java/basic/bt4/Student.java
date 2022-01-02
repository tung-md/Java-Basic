package java.basic.bt4;

public class Student extends Person {
    private String maSinhVien;
    private String email;
    private float diemTongKet;

    public Student() {
    }

    public Student(String maSinhVien, String email, float diemTongKet) {
        this.maSinhVien = maSinhVien;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(float diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\tMa sinh vien: " + maSinhVien + "\tEmail: " + email + "\tDiem tong ket: " + diemTongKet);
    }

    @Override
    public String toString() {
        return super.toString() + maSinhVien + "$" + email + "$" + diemTongKet;
    }
}
