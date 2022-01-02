package java.basic.bt2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClientBT2 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JPanel jPanel;
    private JTextField textField8;
    private JButton themNhanVienButton;
    private JButton luuDuLieuButton;

    private NhanVien nhanVien = new NhanVien();

    public ClientBT2() {
        this.setContentPane(jPanel);
        this.setSize(500,350);

        themNhanVienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nhanVien.setHoTen(textField1.getText());
                nhanVien.setNgaySinh(textField2.getText());
                nhanVien.setGioiTinh(textField3.getText());
                nhanVien.setDiaChi(textField4.getText());
                nhanVien.setPhongBan(textField5.getText());
                nhanVien.setThamNien(Integer.parseInt(textField6.getText()));
                nhanVien.setHeSoLuong(Float.parseFloat(textField7.getText()));
                nhanVien.setLuongCoBan(Float.parseFloat(textField8.getText()));

                nhanVien.print();
            }
        });
        luuDuLieuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String path = "/Users/tung/Desktop/nhanvien.dat";

                    File file = new File(path);
                    FileWriter fileWriter = new FileWriter(file, true);
                    fileWriter.write(nhanVien.toString());
                    fileWriter.close();

                    System.out.print("\nGhi file thanh cong !");

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new ClientBT2();
        jFrame.setVisible(true);
    }
}
