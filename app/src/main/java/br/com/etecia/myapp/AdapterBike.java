package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterBike extends RecyclerView.Adapter<AdapterBike.ViewHolder> {
    private Context context;
    private List<Bike> lstBike;

    public AdapterBike(Context context, List<Bike> lstBike) {
        this.context = context;
        this.lstBike = lstBike;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bicicleta, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lstBike.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBike;
        TextView idTituloBike, txtDescricaoBike, txtNumBike;
        RatingBar rtbBike;
        Button btnComprarBike;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
