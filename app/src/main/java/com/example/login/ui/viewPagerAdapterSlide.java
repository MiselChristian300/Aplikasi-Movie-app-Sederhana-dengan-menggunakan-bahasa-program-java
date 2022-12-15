package com.example.login.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.login.R;

public class viewPagerAdapterSlide extends PagerAdapter {

    Context context;

    int img[] = {
            R.drawable.ic_sisorsicons2svg,
            R.drawable.barbericonsslidemain,
            R.drawable.buildbarba

    };
    int heading[] = {
            R.string.TitleMain1,
            R.string.TitleMain2,
            R.string.TitleMain3
    };
    int deskripsi[] = {
        R.string.infobarber1,
        R.string.infobarber2,
            R.string.infobarber3
    };
    public viewPagerAdapterSlide(Context context){
       this.context = context;
    }
    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =layoutInflater.inflate(R.layout.slider_layouttmain,container,false);

        ImageView SlideImageTitle = (ImageView) view.findViewById(R.id.imageViewSlide_Main);
        TextView TextTitle = (TextView) view.findViewById((R.id.TexviewSlide_Main));
        TextView TextDeskription = (TextView) view.findViewById((R.id.TexviewSlide_Main1));
    SlideImageTitle.setImageResource(img[position]);
    TextTitle.setText(heading[position]);
    TextDeskription.setText(deskripsi[position]);
    container.addView(view);
    return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
    container.removeView((ConstraintLayout) object);

    }

}

