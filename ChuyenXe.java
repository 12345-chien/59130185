/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranquocchien_59130185_baijava4;

/**
 *
 * @author HP
 */
public class ChuyenXe {
      private String maSo, tenTaiXe;
    private double doanhThu;
    public ChuyenXe(String maSo, String tenTaiXe, double doanhThu) {
        super();
        this.maSo = maSo;
        this.tenTaiXe = tenTaiXe;
        this.doanhThu = doanhThu;
    }
    public String getMaSo() {
        return maSo;
    }
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    public String getTenTaiXe() {
        return tenTaiXe;
    }
    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    @Override
    public String toString() {
        return "ChuyenXe [maSo=" + maSo + ", tenTaiXe=" + tenTaiXe
                + ", doanhThu=" + doanhThu + "]";
    }
}
