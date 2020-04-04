package com.example.testdatabooking.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testdatabooking.Activity.Object.OrderJamLapangan;
import com.example.testdatabooking.Activity.Object.OrderLapangan;
import com.example.testdatabooking.Activity.Object.OrderLapanganItems;
import com.example.testdatabooking.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button checkOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.d(TAG, "onCreate: onCreate started.");

        checkOutButton = (Button) findViewById(R.id.check_out_button);
        checkOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        initRecyclerView();

    }

    private void initRecyclerView(){
//        Log.d(TAG, "initRecyclerView: init recycler view");
        RecyclerView recyclerView = findViewById(R.id.recycler_order_lapangan_view);
//        order_lapangan_recycler_view_adapter adapter = new order_lapangan_recycler_view_adapter(detailOrder, this);
//        recyclerView.setAdapteradapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new order_lapangan_recycler_view_adapter(createDummyList(), this));
    }

    private List<OrderLapanganItems> createDummyList(){
        List<OrderLapanganItems> orderLapanganItems = new ArrayList<>();
        OrderLapangan orderLapanganRabu = new OrderLapangan("Rabu, 11 Maret 2020","Lapangan A","Indoor","Lantai Hijau");
        orderLapanganItems.add(orderLapanganRabu);
        String[] jamOrderRabu = {"15:00-16:00", "16:00-17:00", "18:00-20:00"};
        String[] hargaOrderRabu = {"Rp. 25.000", "Rp. 25.000", "Rp. 50.000"};
        for (int i = 0; i<jamOrderRabu.length;i++) {
            OrderJamLapangan orderJamLapangan = new OrderJamLapangan(jamOrderRabu[i], hargaOrderRabu[i]);
            orderLapanganItems.add(orderJamLapangan);
        }
//        OrderLapangan orderLapanganKamis = new OrderLapangan("Kamis, 12 Maret 2020","Lapangan B","Indoor","Lantai Biru");
//        orderLapanganItems.add(orderLapanganKamis);
//        String[] jamOrderKamis = {"11:00-12:00", "12:00-14:00"};
//        String[] hargaOrderKamis = {"Rp. 25.000", "Rp. 50.000"};
//        for (int i = 0; i<jamOrderKamis.length;i++) {
//            OrderJamLapangan orderJamLapangan = new OrderJamLapangan(jamOrderKamis[i], hargaOrderKamis[i]);
//            orderLapanganItems.add(orderJamLapangan);
//        }
        return orderLapanganItems;
    }

    public void openActivity2(){
        Intent intent = new Intent(this, DataBooking2Activity.class);
        startActivity(intent);
    }
}
