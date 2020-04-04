package com.example.testdatabooking.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testdatabooking.R;

import java.util.ArrayList;

public class payment_recycler_view_adapter extends RecyclerView.Adapter<payment_recycler_view_adapter.paymentMethodViewHolder>{

    private ArrayList<PaymentMethod> paymentMethods;
    private Context context;

    public payment_recycler_view_adapter(ArrayList<PaymentMethod> paymentMethods, Context context) {
        this.paymentMethods = paymentMethods;
        this.context = context;
    }

    @NonNull
    @Override
    public paymentMethodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_payment_method, parent, false);
        paymentMethodViewHolder paymentHolder = new paymentMethodViewHolder(view);
        return paymentHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull paymentMethodViewHolder holder, int position) {
        holder.paymentMethodRadioButton.setText(paymentMethods.get(position).getTempMethod());

    }

    @Override
    public int getItemCount() {
        return paymentMethods.size();
    }

    public class paymentMethodViewHolder extends RecyclerView.ViewHolder {

        RadioGroup paymentMethodRadioGroup;
        RadioButton paymentMethodRadioButton;

        public paymentMethodViewHolder(@NonNull View itemView) {
            super(itemView);
            paymentMethodRadioGroup = itemView.findViewById(R.id.radio_group_payment);
            paymentMethodRadioButton = itemView.findViewById(R.id.radio_button_payment);
        }
    }
}
