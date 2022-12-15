package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.login.R;

import java.util.ArrayList;
import java.util.List;

import Models.Cast;

public class CastAdapters extends RecyclerView.Adapter<CastAdapters.CastHolder>{
    Context mContext_cast;
    List<Cast> mdata;

    public CastAdapters(Context mContext_cast, List<Cast> mdata) {
        this.mContext_cast = mContext_cast;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public CastHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(mContext_cast).inflate(R.layout.item_cast, parent, false);

        return new CastHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CastHolder holder, int position) {
        Glide.with(mContext_cast).load(mdata.get(position).getImg_link()).into(holder.img);
    }

    @Override
    public int getItemCount() {

        return mdata.size();
    }

    public class CastHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        public CastHolder(@NonNull View itemView)
        {
            super(itemView);
            img = itemView.findViewById(R.id.cast_foto);
        }
    }

    public static class AdapterTab extends FragmentPagerAdapter {
        private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
        private final ArrayList<String>  titleFragment = new ArrayList<>();

        public AdapterTab(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentArrayList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentArrayList.size();
        }
        public void addFragment(Fragment fragment, String title){
            fragmentArrayList.add(fragment);
            titleFragment.add(title);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titleFragment.get(position);
        }
    }
}
