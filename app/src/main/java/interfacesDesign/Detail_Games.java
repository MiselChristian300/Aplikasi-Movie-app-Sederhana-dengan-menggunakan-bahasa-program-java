package interfacesDesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.login.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import Models.Cast;
import adapters.CastAdapters;

public class Detail_Games extends AppCompatActivity {
        private ImageView ThumnailMoviewithImages,MovieImagesCovers;
        private TextView title_film,descriptionfilm,price;
        private FloatingActionButton play_btns2;
        private RecyclerView ryv_ForCast;
        private CastAdapters castAdapters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        viiews();
        // List Cast Actor
        setupCast();
    }
    void viiews (){

        String titleOfMovie = getIntent().getExtras().getString("title");
        int ResorceImagebyId = getIntent().getExtras().getInt("imgURL");
        int ResorceCoverImage = getIntent().getExtras().getInt("imgCover");
        play_btns2 = findViewById(R.id.play_btns2);
        // Reycle View For Cast List
        ryv_ForCast = findViewById(R.id.ryv_ForCast);
        //
        ThumnailMoviewithImages= findViewById(R.id.detail_movies);
        ThumnailMoviewithImages.setImageResource(ResorceImagebyId);
        MovieImagesCovers = findViewById(R.id.More_detail_Movies);
        Glide.with(this).load(ResorceCoverImage).into(MovieImagesCovers);
        title_film = findViewById(R.id.movie_titles);
        title_film.setText(titleOfMovie);

        // Tidak jadi getSupportActionBar().setTitle(titleOfMovie);
        descriptionfilm = findViewById(R.id.detail_txtMovies);
        Glide.with(this).load(ResorceImagebyId) .into(ThumnailMoviewithImages);

        // Animasi tambahan
        //Extend of material

        ThumnailMoviewithImages.setAnimation(AnimationUtils.loadAnimation(this,R.anim.animations));
        play_btns2.setAnimation(AnimationUtils.loadAnimation(this,R.anim.animations));


    }
    
    void setupCast(){
        List<Cast> mdata = new ArrayList<>();
        mdata.add(new Cast("Director Alexandre Amacio", R.drawable.alexanderasscrd));
        mdata.add(new Cast("Producers Martin Schelling", R.drawable.martinsasscreed));
        mdata.add(new Cast("Voice Actor Assasins Creed", R.drawable.joshlawson));
        castAdapters = new CastAdapters(this, mdata);
        ryv_ForCast.setAdapter(castAdapters);
        ryv_ForCast.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }


}
