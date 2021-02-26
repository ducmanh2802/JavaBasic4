
public class SinhVien {
    int maSV;
    String hoTen;
    float diemLT;
    float diemTH;
    public SinhVien(){}
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public float tinhDTB() {
        return (diemLT + diemLT) / 2;
    }

    public void display(){
        System.out.printf("%3d\t %-15s %8.2f %18.2f %19.2f \n", maSV, hoTen, diemLT, diemTH,tinhDTB());
    }
}
