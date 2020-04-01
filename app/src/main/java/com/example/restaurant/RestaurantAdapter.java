package com.example.restaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    public Context context ;
    public List<Restaurant> list;
    public RestaurantAdapter(Context context , List<Restaurant> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_restaurant,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.ivPic.setImageResource(list.get(position).getPic()[0]);
        holder.tvName.setText(list.get(position).getName());
        holder.tvType.setText(list.get(position).getType());
        holder.tvAddress.setText(list.get(position).getAddress());
        holder.rtbar.setRating(list.get(position).getRate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickListener!=null){
                    clickListener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class  ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivPic;
        TextView tvName;
        TextView tvType;
        TextView tvAddress;
        RatingBar rtbar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPic = itemView.findViewById(R.id.iv_logo);
            tvName = itemView.findViewById(R.id.displayname);
            tvType = itemView.findViewById(R.id.display_type);
            tvAddress = itemView.findViewById(R.id.tv_address);
            rtbar = itemView.findViewById(R.id.rtbar);
        }
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    private  OnItemClickListener clickListener;


}
