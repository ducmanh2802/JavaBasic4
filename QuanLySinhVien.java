public class QuanLySinhVien {
    public static void main(String[] args) throws Exception {
        SinhVien sv1 = new SinhVien();
        sv1.maSV = 20211;
        sv1.name = "Hung";
        sv1.diemLT = 6;
        sv1.diemTH = 7;
        System.out.println("Điểm trung bình của sinh viên" + sv1.name + " là:" + sv1.tinhDTB());

        SinhVien sv2 = new SinhVien();
        sv2.maSV = 20211;
        sv2.name = "Hung";
        sv2.diemLT = 8;
        sv2.diemTH = 10;
        System.out.println("Điểm trung bình của sinh viên" + sv2.name + " là:" + sv2.tinhDTB());

        SinhVien sv3 = new SinhVien();
        sv3.maSV = 20211;
        sv3.name = "Hung";
        sv3.diemLT = 8;
        sv3.diemTH = 7;
        System.out.println("Điểm trung bình của sinh viên" + sv3.name + " là:" + sv3.tinhDTB());

        SinhVien sv4 = new SinhVien(20204, "Minh", 9, 8);
        System.out.println("Điểm trung bình của sinh viên" + sv4.name + " là:" + sv4.tinhDTB());
    }
}
