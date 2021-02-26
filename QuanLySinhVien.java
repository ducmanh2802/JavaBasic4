public class QuanLySinhVien {
    public static void main(String[] args) throws Exception {
        SinhVien sv1 = new SinhVien();
        sv1.maSV = 20211;
        sv1.hoTen = "Hung";
        sv1.diemLT = 6.0f;
        sv1.diemTH = 7.0f;

        SinhVien sv2 = new SinhVien();
        sv2.maSV = 20211;
        sv2.hoTen = "Hung";
        sv2.diemLT = 8.5f;
        sv2.diemTH = 10.0f;


        SinhVien sv3 = new SinhVien();
        sv3.maSV = 20211;
        sv3.hoTen = "Hung";
        sv3.diemLT = 8.0f;
        sv3.diemTH = 7.0f;

        SinhVien sv4 = new SinhVien(20204, "Minh", 9.0f, 8.5f);
        System.out.printf("%5s %10s %18s %18s %18s \n", "Ma SV", "Ho Ten", "Diem LT", "Diem TH","Diem trung binh");
        sv1.display();
        sv2.display();
        sv3.display();
        sv4.display();

    }
}
