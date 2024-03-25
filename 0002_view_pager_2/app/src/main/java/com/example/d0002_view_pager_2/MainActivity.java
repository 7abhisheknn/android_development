package com.example.d0002_view_pager_2;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<SliderItem> sliderItemList = new ArrayList<SliderItem>(){{
        add(new SliderItem("page_1", "#FF0000"));
        add(new SliderItem("page_2", "#00FF00"));
        add(new SliderItem("page_3", "#0000FF"));
        add(new SliderItem("page_4", "#FFFF00"));
        add(new SliderItem("page_5", "#FF00FF"));
        add(new SliderItem("page_6", "#00FFFF"));
    }};
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        viewPager2.setAdapter(new SliderAdapter(sliderItemList, viewPager2));

    }
}