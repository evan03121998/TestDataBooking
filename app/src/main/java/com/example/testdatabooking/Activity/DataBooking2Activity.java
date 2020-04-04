package com.example.testdatabooking.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.testdatabooking.R;

import java.util.ArrayList;

public class DataBooking2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_booking_2);
        initPaymentRecyclerView();
    }

    private void initPaymentRecyclerView(){
//        Log.d(TAG, "initRecyclerView: init recycler view");
        RecyclerView recyclerView = findViewById(R.id.recycler_payment_method_summary_view);
//        order_lapangan_recycler_view_adapter adapter = new order_lapangan_recycler_view_adapter(detailOrder, this);
//        recyclerView.setAdapteradapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new payment_recycler_view_adapter(createDummyPaymentList(), this));
    }

    private ArrayList<PaymentMethod> createDummyPaymentList(){
        ArrayList<PaymentMethod> paymentMethodItems = new ArrayList<>();
        PaymentMethod paymentMethodTransfer = new PaymentMethod("Transfer\nBCA 201302193019 a/n Steven");
        paymentMethodItems.add(paymentMethodTransfer);
        PaymentMethod paymentMethodCash = new PaymentMethod("Cash");
        paymentMethodItems.add(paymentMethodCash);
        PaymentMethod paymentMethodOVO = new PaymentMethod("OVO");
        paymentMethodItems.add(paymentMethodOVO);
        return paymentMethodItems;
    }
}
