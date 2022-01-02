package java.basic.bt4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ClientBT4 extends JFrame{
    private JPanel jPanel;
    private JTable table1;
    private List<Student> studentList = new ArrayList<Student>();

    public ClientBT4() {
        this.setContentPane(jPanel);
        this.setSize(500,350);

        createUIComponents();
    }

    private void createUIComponents() {
        loadData();

        DefaultTableModel defaultTableModel = new DefaultTableModel(
                null, new String[] {"Họ tên", "Ngày sinh", "Địa chỉ", "Giới tính", "Mã sinh viên", "Email", "Điểm tổng kết"}
        );

        for (Student student : studentList) {
            Object[] data = {student.getHoTen(), student.getNgaySinh(), student.getDiaChi(), student.getGioiTinh(),
                    student.getMaSinhVien(), student.getEmail(), student.getDiemTongKet()};

            defaultTableModel.addRow(data);
        }

        table1.setModel(defaultTableModel);
    }

    private void loadData() {
        try {
            File file = new File("/Users/tung/Desktop/sinhvien.dat");
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("\\$");
                Student student = new Student();

                student.setHoTen(data[0]);
                student.setNgaySinh(data[1]);
                student.setDiaChi(data[2]);
                student.setGioiTinh(data[3]);
                student.setMaSinhVien(data[4]);
                student.setEmail(data[5]);
                student.setDiemTongKet(Float.parseFloat(data[6]));

                studentList.add(student);
            }
            for (Student student : studentList) student.print();

            fileReader.close();

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame jFrame = new ClientBT4();
        jFrame.setVisible(true);
    }
}
