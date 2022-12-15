package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.login.R;

import java.util.List;

import Models.slides_itm;

public class SlidesPages extends PagerAdapter {
    private Context mcContext;
    private List<slides_itm> mList;


    public  SlidesPages(Context mcContext, List<slides_itm> mList) {
        this.mcContext = mcContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        LayoutInflater inflater = (LayoutInflater) mcContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slideLayout = inflater.inflate(R.layout.sliders_itm, null);

        ImageView slideImgs = slideLayout.findViewById(R.id.slide_img);
        slideImgs.setImageResource(mList.get(position).getImage());

        container.addView(slideLayout);
        return  slideLayout;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
