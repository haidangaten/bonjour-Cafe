package com.example.msi.bonjourcafe.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Food {
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("TenHangHoa")
    @Expose
    private String tenHangHoa;
    @SerializedName("MaHangHoa")
    @Expose
    private String maHangHoa;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("TenDonViTinh")
    @Expose
    private String tenDonViTinh;
    @SerializedName("DonViTinh")
    @Expose
    private String donViTinh;
    @SerializedName("NhomHangHoa")
    @Expose
    private String nhomHangHoa;
    @SerializedName("TenNhomHangHoa")
    @Expose
    private String tenNhomHangHoa;
    @SerializedName("DonGia")
    @Expose
    private String donGia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTenDonViTinh() {
        return tenDonViTinh;
    }

    public void setTenDonViTinh(String tenDonViTinh) {
        this.tenDonViTinh = tenDonViTinh;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getNhomHangHoa() {
        return nhomHangHoa;
    }

    public void setNhomHangHoa(String nhomHangHoa) {
        this.nhomHangHoa = nhomHangHoa;
    }

    public String getTenNhomHangHoa() {
        return tenNhomHangHoa;
    }

    public void setTenNhomHangHoa(String tenNhomHangHoa) {
        this.tenNhomHangHoa = tenNhomHangHoa;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

//    public static class FoodResult{
//        private List<Food> results;
//        private List<Food> getResults(){
//            return results;
//        }
//    }


}
