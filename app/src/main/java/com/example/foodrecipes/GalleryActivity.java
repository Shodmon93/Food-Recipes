package com.example.foodrecipes;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

      getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        importInfo();
        button();
    }
    private void importInfo(){

        ImageView imageView = findViewById(R.id.r_image_view);
        Bundle bundle = getIntent().getExtras();
        int resId = bundle.getInt("fImage");
        imageView.setImageResource(resId);

        TextView galleryText = findViewById(R.id.gallery_text);
        String foodInfo = getIntent().getStringExtra("fInfo");
        galleryText.setText(foodInfo);

        TextView howToCook = findViewById(R.id.how_cook);
        String howCook = getIntent().getStringExtra("fCook");
        howToCook.setText(howCook);

        TextView foodName = findViewById(R.id.foodName);
        String FName = getIntent().getStringExtra("fName");
        foodName.setText(FName);

    }
    private void button (){

    ImageButton like = findViewById(R.id.like);
        like.setBackgroundColor(Color.WHITE);
        like.setOnClickListener(new View.OnClickListener() {
        ValueAnimator likeButton = null;
        @Override
        public void onClick(View v) {
            if (likeButton != null) {
                likeButton.reverse();
                likeButton = null;
            } else {
                final ImageButton button = (ImageButton) v;
                likeButton = ValueAnimator.ofObject(new ArgbEvaluator(),Color.WHITE, Color.RED);
                likeButton.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        button.setBackgroundColor((Integer) animation.getAnimatedValue());
                    }
                });
                likeButton.start();

}
        }});
    }
}