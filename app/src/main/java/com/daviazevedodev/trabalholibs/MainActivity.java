package com.daviazevedodev.trabalholibs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart piechart = findViewById(R.id.graphic);

        ArrayList<PieEntry> desemprego = new ArrayList<>();
        desemprego.add(new PieEntry(11.5f, "2016"));
        desemprego.add(new PieEntry(12.7f, "2017"));
        desemprego.add(new PieEntry(12.3f, "2018"));
        desemprego.add(new PieEntry(11.9f, "2019"));
        desemprego.add(new PieEntry(12.2f, "2020"));

        PieDataSet pieDataSet = new PieDataSet(desemprego, "Desemprego %");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        piechart.setData(pieData);
        piechart.setCenterText("Índice de desemprego no Brasil");
        piechart.animate();



        ImageView imageView1 = findViewById(R.id.image_view1);
        String url = "https://media.esmaelmorais.com.br/2019/04/sobe-desemprego-carteira-assinada-mar%C3%A7o.jpeg";
        Picasso.get().load(url).into(imageView1);
    }
}