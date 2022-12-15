package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login.R;

import java.util.List;

import Models.Movies;

public class MovieAdapter extends RecyclerView .Adapter<MovieAdapter.MyViewHolder>{
    Context context;
    List<Movies> mdata;
    ItemClicklistener itemClicklistener;

    public MovieAdapter(Context context, List<Movies> mdata, ItemClicklistener lists){
        this.context = context;
        this.mdata = mdata;
        itemClicklistener = lists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(context).inflate(R.layout.itm_movie,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

          myViewHolder.Tvtitle.setText(mdata.get(i).getTitle());
          myViewHolder.imgMovie.setImageResource(mdata.get(i).getThumnail());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView Tvtitle;
        private ImageView imgMovie;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Tvtitle = itemView.findViewById(R.id.title_movies);
            imgMovie = itemView.findViewById(R.id.item_imagesmovies);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClicklistener.MovieClick(mdata.get(getAdapterPosition()),imgMovie);
                }
            });

        }
    }
}
