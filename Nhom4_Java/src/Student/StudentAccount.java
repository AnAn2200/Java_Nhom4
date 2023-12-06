package Student;
public class StudentAccount {
    
    public String TaiKhoan;
    public String MatKhau;

    public StudentAccount() {
    }
    public StudentAccount(String TaiKhoan, String MatKhau) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
    }
    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
}
