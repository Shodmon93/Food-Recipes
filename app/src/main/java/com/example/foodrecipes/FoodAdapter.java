package com.example.foodrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;


public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodInfoHolder> {
    ArrayList<Integer> fImage = new ArrayList<>();
    ArrayList<String> fName = new ArrayList<>();
    ArrayList<String> fInfo = new ArrayList<>();
    ArrayList<String> howCook = new ArrayList<>();
    Context fContext;

    public FoodAdapter(ArrayList<Integer> fImage, ArrayList<String> fName, ArrayList<String> fInfo, ArrayList<String> howCook,Context fContext) {
        this.fImage = fImage;
        this.fName = fName;
        this.fInfo = fInfo;
        this.howCook = howCook;
        this.fContext = fContext;
    }
    @Override
    public FoodInfoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food__adapter_layout, parent,false);
        FoodInfoHolder FoodHolder = new FoodInfoHolder(view);
        return FoodHolder;
    }

    @Override
    public void onBindViewHolder(FoodAdapter.FoodInfoHolder holder, int position) {

        Glide.with(fContext)
                .asBitmap()
                .load(fImage.get(position))
                .into(holder.foodImage);
        holder.foodName.setText(fName.get(position));
        holder.foodInfo.setText(fInfo.get(position));
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(fContext,GalleryActivity.class);
                intent.putExtra("fCook", howCook.get(position));
                intent.putExtra("fImage",fImage.get(position));
                intent.putExtra("fInfo", fInfo.get(position));
                intent.putExtra("fName", fName.get(position));
                fContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fImage.size();
    }

    public class FoodInfoHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView foodName;
        TextView foodInfo;
        RelativeLayout mainLayout;
        TextView howCook;
        public FoodInfoHolder(View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            foodName = itemView.findViewById(R.id.food_name);
            foodInfo = itemView.findViewById(R.id.food_info);
            mainLayout = itemView.findViewById(R.id.main_layout);
            howCook = itemView.findViewById(R.id.how_cook);
        }

    }
}
