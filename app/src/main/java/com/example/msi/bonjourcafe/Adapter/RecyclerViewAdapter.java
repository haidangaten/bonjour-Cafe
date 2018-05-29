package com.example.msi.bonjourcafe.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.msi.bonjourcafe.Model.Food;

import com.example.msi.bonjourcafe.R;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    String url="http://bonjour.greensoft.vn";
    public Context context;
    private List<Food> list;

    public RecyclerViewAdapter(Context context, List<Food> list) {
        this.context = context;
        this.list=list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.cardview_item_list,parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Food food=list.get(position);
        holder.txtTenHH.setText(food.getTenHangHoa());

        Float number = Float.parseFloat( food.getDonGia());
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        String dongia = decimalFormat.format(number);

        holder.txtDonGia.setText(dongia+" đ");

        Picasso.with(context).load(url+food.getImageUrl()).centerCrop().resize(100,100).into(holder.imgView);


    }

    @Override
    public int getItemCount() {
        return (list==null) ?0:list.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtTenHH,txtDonGia;
        ImageView imgView;
        public MyViewHolder(View itemView) {
            super(itemView);

            txtTenHH=(TextView)itemView.findViewById(R.id.txtTenHH);
            txtDonGia=(TextView)itemView.findViewById(R.id.txtDonGia);
            imgView=(ImageView)itemView.findViewById(R.id.imgView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
