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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterBike extends RecyclerView.Adapter<AdapterBike.ViewHolder> {
    private final Context context;
    private final List<Bike> lstBike;

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
        holder.txtTituloBike.setText(lstBike.get(position).getTitulo());
        holder.txtDescricaoBike.setText(lstBike.get(position).getSubTitulo());
        holder.txtNumBike.setText(lstBike.get(position).getNota());
        holder.rtbBike.setRating(lstBike.get(position).getNumRating());
    }

    @Override
    public int getItemCount() {
        return lstBike.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBike;
        TextView txtTituloBike, txtDescricaoBike, txtNumBike;
        RatingBar rtbBike;
        Button btnComprarBike;

        CardView idCardBikes;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBike = itemView.findViewById(R.id.imgBike);
            txtTituloBike = itemView.findViewById(R.id.txtTituloBike);
            txtDescricaoBike = itemView.findViewById(R.id.txtDescricaoBike);
            txtNumBike = itemView.findViewById(R.id.txtNumBike);
            rtbBike = itemView.findViewById(R.id.rtbBike);
            btnComprarBike = itemView.findViewById(R.id.btnComprarBike);
            idCardBikes = itemView.findViewById(R.id.idCardBikes);
        }
    }
}
