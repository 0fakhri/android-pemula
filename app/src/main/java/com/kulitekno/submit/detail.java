package com.kulitekno.submit;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class detail extends AppCompatActivity {
    public static final String TITLE = "nothing";
    public static final String ISI = "falcon";
    public static final String Lenght = "panjang";
    public static final String Widht = "lebar";
    public static final String Height = "tinggi";
    public static final String Machine = "mesin";
    public static final String Speed = "maks";
    public static String img_data;
    TextView tvName, tvDetail, tvLenght, tvHeight, tvWidht, tvMachine, tvSpeed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getData();
    }

    private void getData(){
        String judul = getIntent().getStringExtra(TITLE);
        String detailIsi = getIntent().getStringExtra(ISI);
        String pjg = getIntent().getStringExtra(Lenght);
        String lbr = getIntent().getStringExtra(Widht);
        String tgi = getIntent().getStringExtra(Height);
        String mes = getIntent().getStringExtra(Machine);
        String spe = getIntent().getStringExtra(Speed);
        int img = getIntent().getIntExtra(img_data,5);
        setImage(img);
        setIsi(judul, detailIsi, pjg, tgi, lbr, mes, spe);
        getSupportActionBar().setTitle(judul);
    }

    private void setImage(int img){
        ImageView imagePhoto = findViewById(R.id.image);
        Glide.with(this)
                .load(img)
                .into(imagePhoto);
    }

    private void setIsi(String judul, String detailIsi, String pjg, String tgi, String lbr, String mes, String spe){
        tvName = findViewById(R.id.tv_item_name);
        tvDetail = findViewById(R.id.tv_item_detail);
        tvLenght = findViewById(R.id.panjang);
        tvHeight = findViewById(R.id.tinggi);
        tvWidht = findViewById(R.id.lebar);
        tvMachine = findViewById(R.id.mesin);
        tvSpeed = findViewById(R.id.speed);
        tvName.setText(judul);
        tvDetail.setText(detailIsi);
        tvLenght.setText(pjg);
        tvHeight.setText(tgi);
        tvWidht.setText(lbr);
        tvMachine.setText(mes);
        tvSpeed.setText(spe);
    }
}
