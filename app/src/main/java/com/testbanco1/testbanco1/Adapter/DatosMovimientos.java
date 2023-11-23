package com.testbanco1.testbanco1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.testbanco1.testbanco1.R;

import java.util.List;

public class DatosMovimientos extends RecyclerView.Adapter<DatosMovimientos.ViewHolder> {

    private List<com.testbanco1.testbanco1.modelo.DatosMovimientos> datoes;
    private Context context;

    public DatosMovimientos(List<com.testbanco1.testbanco1.modelo.DatosMovimientos> datoes, Context context) {
        this.datoes = datoes;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtConcepto.setText(datoes.get(position).getDescripcion());
        holder.txtFecha.setText(datoes.get(position).getFecha());
        holder.txtMonto.setText(datoes.get(position).getMonto());
    }


    @Override
    public int getItemCount() {
        return datoes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtConcepto, txtFecha, txtMonto;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtConcepto=itemView.findViewById(R.id.txtConcepto);
            txtFecha=itemView.findViewById(R.id.txtFecha);
            txtMonto=itemView.findViewById(R.id.txtMonto);
        }
    }
}
