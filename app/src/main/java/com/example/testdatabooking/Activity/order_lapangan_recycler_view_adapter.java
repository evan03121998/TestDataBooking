package com.example.testdatabooking.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testdatabooking.Activity.Object.OrderJamLapangan;
import com.example.testdatabooking.Activity.Object.OrderLapangan;
import com.example.testdatabooking.Activity.Object.OrderLapanganItems;
import com.example.testdatabooking.R;

import java.util.List;

public class order_lapangan_recycler_view_adapter extends RecyclerView.Adapter{
    private static final String TAG = "order_lapangan_recycler";

    List<OrderLapanganItems> orderLapanganItems;
//    private ArrayList<OrderLapangan> tempOrderLapangan = new ArrayList<>();
    private static final int ORDER_LAPANGAN_ITEM = 0;
    private static final int ORDER_LAPANGAN_JAM_ITEM = 1;
    private Context tempContext;

    public order_lapangan_recycler_view_adapter(List<OrderLapanganItems> orderLapanganItems, Context tempContext) {
        this.orderLapanganItems = orderLapanganItems;
        this.tempContext = tempContext;
    }

    //    public order_lapangan_recycler_view_adapter(ArrayList<OrderLapangan> tempOrderLapangan, Context tempContext) {
//        this.tempOrderLapangan = tempOrderLapangan;
//        this.tempContext = tempContext;
//    }

    @Override
    public int getItemViewType(int position) {
        //if buat ganti antara view 1 ato 2
        OrderLapanganItems orderLapanganItem = orderLapanganItems.get(position);
        if (orderLapanganItem instanceof OrderLapangan){
            return ORDER_LAPANGAN_ITEM;
        }else if (orderLapanganItem instanceof OrderJamLapangan){
            return ORDER_LAPANGAN_JAM_ITEM;
        }else {
            return super.getItemViewType(position);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == ORDER_LAPANGAN_ITEM){
            view = layoutInflater.inflate(R.layout.layout_order_lapangan, parent, false);
            return new ViewHolderOne(view);
        }else if (viewType == ORDER_LAPANGAN_JAM_ITEM) {
            view = layoutInflater.inflate(R.layout.layout_order_lapangan_jam, parent, false);
            return new ViewHolderTwo(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        OrderLapanganItems orderLapanganItem = orderLapanganItems.get(position);
        if (holder instanceof ViewHolderOne){
            ViewHolderOne viewHolderOne = (ViewHolderOne) holder;
            OrderLapangan orderLapangan = (OrderLapangan) orderLapanganItem;
            viewHolderOne.tanggalOrder.setText(orderLapangan.getTempTanggalOrder());
            viewHolderOne.lapanganOrder.setText(orderLapangan.getTempLapanganOrder());
            viewHolderOne.lapanganTypeOrder.setText(orderLapangan.getTempLapanganTypeOrder());
            viewHolderOne.lantaiTypeOrder.setText(orderLapangan.getTempLantaiTypeOrder());
        }else if (holder instanceof ViewHolderTwo){
            ViewHolderTwo viewHolderTwo = (ViewHolderTwo) holder;
            OrderJamLapangan orderJamLapangan = (OrderJamLapangan) orderLapanganItem;
            viewHolderTwo.jamOrder.setText(orderJamLapangan.getTempJamOrder());
            viewHolderTwo.hargaOrder.setText(orderJamLapangan.getTempHargaOrder());
        }
    }

    @Override
    public int getItemCount() {
        return orderLapanganItems.size();
    }

    class ViewHolderOne extends RecyclerView.ViewHolder{

        TextView tanggalOrder;
        TextView lapanganOrder;
        TextView lapanganTypeOrder;
        TextView lantaiTypeOrder;
        LinearLayout orderLapanganLayout;

        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            tanggalOrder = itemView.findViewById(R.id.tanggal_order);
            lapanganOrder = itemView.findViewById(R.id.lapangan_order);
            lapanganTypeOrder = itemView.findViewById(R.id.lapangan_type_order);
            lantaiTypeOrder = itemView.findViewById(R.id.lantai_type_order);
            orderLapanganLayout = itemView.findViewById(R.id.order_lapangan_layout);
        }
    }

    class ViewHolderTwo extends RecyclerView.ViewHolder{

        TextView jamOrder;
        TextView hargaOrder;
        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
            jamOrder = itemView.findViewById(R.id.jam_label);
            hargaOrder = itemView.findViewById(R.id.harga_label);
        }
    }
}
