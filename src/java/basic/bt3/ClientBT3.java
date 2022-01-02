package java.basic.bt3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ClientBT3 extends JFrame{
    private JPanel jPanel;
    private JTable table1;
    private List<NhanVien> nhanVienList = new ArrayList<NhanVien>();

    public ClientBT3() {
        this.setContentPane(jPanel);
        this.setSize(500,350);

        createUIComponents();
    }

    private void createUIComponents() {
        loadData();

        DefaultTableModel defaultTableModel = new DefaultTableModel(
                null, new String[] {"Họ tên", "Ngày sinh", "Địa chỉ", "Giới tính", "Phòng ban", "Thâm niên",
                "Hệ số lương", "Lương cơ bản", "Lương thực lĩnh"}
        );

        for (NhanVien nhanVien : nhanVienList) {
            Object[] data = {nhanVien.getHoTen(), nhanVien.getNgaySinh(), nhanVien.getDiaChi(), nhanVien.getGioiTinh(),
                    nhanVien.getPhongBan(), nhanVien.getThamNien(), nhanVien.getHeSoLuong(), nhanVien.getLuongCoBan(),
                    nhanVien.tinhLuongThucLinh()};

            defaultTableModel.addRow(data);
        }

        table1.setModel(defaultTableModel);
    }

    private void loadData() {
        try {
            File file = new File("/Users/tung/Desktop/nhanvien.dat");
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("\\$");
                NhanVien nhanVien = new NhanVien();

                nhanVien.setHoTen(data[0]);
                nhanVien.setNgaySinh(data[1]);
                nhanVien.setDiaChi(data[2]);
                nhanVien.setGioiTinh(data[3]);
                nhanVien.setPhongBan(data[4]);
                nhanVien.setThamNien(Integer.parseInt(data[5]));
                nhanVien.setHeSoLuong(Float.parseFloat(data[6]));
                nhanVien.setLuongCoBan(Float.parseFloat(data[7]));

                nhanVienList.add(nhanVien);
            }
            for (NhanVien nhanVien : nhanVienList) nhanVien.print();

            fileReader.close();

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new ClientBT3();
        jFrame.setVisible(true);
    }
}
