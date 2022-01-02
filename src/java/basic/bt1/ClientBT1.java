package java.basic.bt1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClientBT1 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton themSinhVienButton;
    private JButton luuDuLieuButton;
    private JPanel jPanel;

    private Student student = new Student();

    public ClientBT1() {
        this.setContentPane(jPanel);
        this.setSize(400,350);

        themSinhVienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.setHoTen(textField1.getText());
                student.setNgaySinh(textField2.getText());
                student.setGioiTinh(textField3.getText());
                student.setDiaChi(textField4.getText());
                student.setMaSinhVien(textField5.getText());
                student.setEmail(textField6.getText());
                student.setDiemTongKet(Float.parseFloat(textField7.getText()));

                student.print();
            }
        });
        luuDuLieuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String path = "/Users/tung/Desktop/sinhvien.dat";

                    File file = new File(path);
                    FileWriter fileWriter = new FileWriter(file, true);
                    fileWriter.write(student.toString());
                    fileWriter.close();

                    System.out.print("\nGhi file thanh cong !");

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new ClientBT1();
        jFrame.setVisible(true);
    }
}
