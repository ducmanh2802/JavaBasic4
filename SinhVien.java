public class SinhVien {
    int maSV;
    String name;
    float diemLT;
    float diemTH;
    public SinhVien(){}
    public SinhVien(int maSV, String name, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public float tinhDTB() {
        return (diemLT + diemLT) / 2;
    }
}
