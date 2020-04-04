package com.example.testdatabooking.Activity.Object;

public class OrderJamLapangan extends OrderLapanganItems{
    private String tempJamOrder;
    private String tempHargaOrder;

    public OrderJamLapangan(String tempJamOrder, String tempHargaOrder) {
        this.tempJamOrder = tempJamOrder;
        this.tempHargaOrder = tempHargaOrder;
    }

    public String getTempJamOrder() {
        return tempJamOrder;
    }

    public void setTempJamOrder(String tempJamOrder) {
        this.tempJamOrder = tempJamOrder;
    }

    public String getTempHargaOrder() {
        return tempHargaOrder;
    }

    public void setTempHargaOrder(String tempHargaOrder) {
        this.tempHargaOrder = tempHargaOrder;
    }
}
