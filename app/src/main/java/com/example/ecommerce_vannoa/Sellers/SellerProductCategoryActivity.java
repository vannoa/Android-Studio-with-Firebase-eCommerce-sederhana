package com.example.ecommerce_vannoa.Sellers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerce_vannoa.R;

public class SellerProductCategoryActivity extends AppCompatActivity {

    private ImageView tShirts, sportsShirts, keMeja, sWeater;
    private ImageView gLasses3, wBag, haT, sHoes;
    private ImageView headPhone, lapTop, watChes, handPhone;

    //private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_product_category);

        tShirts = (ImageView) findViewById(R.id.t_shirts);
        sportsShirts = (ImageView) findViewById(R.id.sport_shirt);
        keMeja = (ImageView) findViewById(R.id.kemeja);
        sWeater = (ImageView) findViewById(R.id.sweater);

        gLasses3 = (ImageView) findViewById(R.id.glasses3);
        wBag = (ImageView) findViewById(R.id.wbag);
        haT = (ImageView) findViewById(R.id.hat);
        sHoes = (ImageView) findViewById(R.id.shoes);

        headPhone = (ImageView) findViewById(R.id.headphone);
        lapTop = (ImageView) findViewById(R.id.laptop);
        watChes = (ImageView) findViewById(R.id.watch);
        handPhone = (ImageView) findViewById(R.id.handphone);


        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });

        sportsShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Sports Shirts");
                startActivity(intent);
            }
        });
        keMeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Kemeja");
                startActivity(intent);
            }
        });
        sWeater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Sweater");
                startActivity(intent);
            }
        });
        gLasses3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });
        wBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Women Bag");
                startActivity(intent);
            }
        });
        haT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Hat");
                startActivity(intent);
            }
        });
        sHoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Shoes");
                startActivity(intent);
            }
        });
        headPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "HeadPhone");
                startActivity(intent);
            }
        });
        lapTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Laptop");
                startActivity(intent);
            }
        });
        watChes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });
        handPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "HandPhone");
                startActivity(intent);
            }
        });

    }
}
