package facci.kevincastro.creandoeventos;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Eventos> mData;
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Eventos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_home, parent, false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_home);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));



        vHolder.item_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name = (TextView) myDialog.findViewById(R.id.dialog_name);
                TextView dialog_fecha = (TextView) myDialog.findViewById(R.id.dialog_fecha);
                TextView dialog_lugar = (TextView) myDialog.findViewById(R.id.dialog_lugar);
                TextView dialog_orga = (TextView) myDialog.findViewById(R.id.dialog_organizador);
                TextView dialog_hora = (TextView) myDialog.findViewById(R.id.dialog_hora);
                ImageView dialog_img = (ImageView) myDialog.findViewById(R.id.dialog_img);
                dialog_name.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_fecha.setText(mData.get(vHolder.getAdapterPosition()).getFecha());
                dialog_lugar.setText(mData.get(vHolder.getAdapterPosition()).getLugar());
                dialog_orga.setText(mData.get(vHolder.getAdapterPosition()).getOrganizador());
                dialog_hora.setText(mData.get(vHolder.getAdapterPosition()).getHora());
                dialog_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
                myDialog.show();
            }
        });
        return vHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_fecha.setText(mData.get(position).getFecha());
        holder.tv_lugar.setText(mData.get(position).getLugar());
        holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_home;
        private TextView tv_name;
        private TextView tv_fecha;
        private TextView tv_lugar;
        private TextView dialog_org;
        private TextView dialog_hora;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_home = (LinearLayout) itemView.findViewById(R.id.home_item);
            tv_name = (TextView)itemView.findViewById(R.id.name_home);
            tv_fecha = (TextView)itemView.findViewById(R.id.fecha_home);
            tv_lugar = (TextView)itemView.findViewById(R.id.lugar_home);
            dialog_org = (TextView)itemView.findViewById(R.id.dialog_organizador);
            dialog_hora = (TextView)itemView.findViewById(R.id.dialog_hora);
            img = (ImageView)itemView.findViewById(R.id.img_home);



        }
    }






}

