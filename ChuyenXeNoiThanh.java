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
public class ChuyenXeNoiThanh extends ChuyenXe{
        private int soTuyen, soKM;

    public ChuyenXeNoiThanh(String maSo, String tenTaiXe, double doanhThu,
            int soTuyen, int soKM) {
        super(maSo, tenTaiXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }
    
    @Override
    public String toString() {
        return super.toString() + "ChuyenXeNoiThanh [soTuyen=" + soTuyen +         ", soKM=" + soKM + "]";
    }
}
