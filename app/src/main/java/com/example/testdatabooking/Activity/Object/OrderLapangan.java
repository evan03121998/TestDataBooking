package com.example.testdatabooking.Activity.Object;

public class OrderLapangan extends OrderLapanganItems{
    private String tempTanggalOrder;
    private String tempLapanganOrder;
    private String tempLapanganTypeOrder;
    private String tempLantaiTypeOrder;


    public OrderLapangan(String tempTanggalOrder, String tempLapanganOrder, String tempLapanganTypeOrder, String tempLantaiTypeOrder) {
        this.tempTanggalOrder = tempTanggalOrder;
        this.tempLapanganOrder = tempLapanganOrder;
        this.tempLapanganTypeOrder = tempLapanganTypeOrder;
        this.tempLantaiTypeOrder = tempLantaiTypeOrder;

    }

    public String getTempTanggalOrder() {
        return tempTanggalOrder;
    }

    public void setTempTanggalOrder(String tempTanggalOrder) {
        this.tempTanggalOrder = tempTanggalOrder;
    }

    public String getTempLapanganOrder() {
        return tempLapanganOrder;
    }

    public void setTempLapanganOrder(String tempLapanganOrder) {
        this.tempLapanganOrder = tempLapanganOrder;
    }

    public String getTempLapanganTypeOrder() {
        return tempLapanganTypeOrder;
    }

    public void setTempLapanganTypeOrder(String tempLapanganTypeOrder) {
        this.tempLapanganTypeOrder = tempLapanganTypeOrder;
    }

    public String getTempLantaiTypeOrder() {
        return tempLantaiTypeOrder;
    }

    public void setTempLantaiTypeOrder(String tempLantaiTypeOrder) {
        this.tempLantaiTypeOrder = tempLantaiTypeOrder;
    }


}
