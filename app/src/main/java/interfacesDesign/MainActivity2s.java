package interfacesDesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import adapters.CastAdapters;
import adapters.ItemClicklistener;
import adapters.MovieAdapter;
import Models.Movies;

import com.example.login.R;
import com.google.android.material.tabs.TabLayout;

import adapters.SlidesPages;
import Models.slides_itm;
import de.hdodenhof.circleimageview.CircleImageView;
import utils.SourceDt_duplicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2s extends AppCompatActivity implements ItemClicklistener {
    Dialog popupDialog;
    Dialog popupdialog2;
    private List<slides_itm> lastSlides;
    private ViewPager sliderPager;
    private RecyclerView MovieRv,MovieRvWomen;
    private TabLayout tabLayout;
    private ViewPager viewPagers;
    private CircleImageView circleImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2s);
       popupDialog = new Dialog(this);
       popupdialog2 = new Dialog(this);
       circleImageView = (CircleImageView) findViewById(R.id.proviles);
       circleImageView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Seting_Provile();
           }
           public void Seting_Provile(){
               Intent intent = new Intent(MainActivity2s.this, setings_profile.class);
               startActivity(intent);
           }
       });
       //TablayoutcontentJava
        tabLayout = findViewById(R.id.viewpagers2);
        CastAdapters.AdapterTab adapterTab = new CastAdapters.AdapterTab(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        adapterTab.addFragment(new Fragmentlayout_1(),"Activities");
//        adapterTab.addFragment(new Feagmentlayout_2(),"Express");
//       viewPagers.setAdapter(adapterTab);

      viewsin_duplicate();
      viewslides_dupicate();
        viewsslides_duplicate();
       viewsin_duplicate_women();


    }
    public void showPopup(View v){
        TextView txtclose;
        popupDialog.setContentView(R.layout.pop_ui);
        txtclose =(TextView) popupDialog.findViewById(R.id.idclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               popupDialog.dismiss();
            }
        });
        popupDialog.show();

    }

    public void showPopup2(View v) {
        TextView txtclose2;
        popupdialog2.setContentView(R.layout.popup_2barberhair);
        txtclose2 = (TextView) popupdialog2.findViewById(R.id.close_txt);
        txtclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupdialog2.dismiss();
            }
        });
        popupdialog2.show();
    }



    private void viewsin_duplicate_women() {
        MovieAdapter RvWomen = new MovieAdapter(this,SourceDt_duplicate.getMovieRvWmn(),this);
        MovieRvWomen.setAdapter(RvWomen);
        MovieRvWomen.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
    }

    private void viewsslides_duplicate() {
        //Recyle View Component


        MovieAdapter movieAdapter = new MovieAdapter(this, SourceDt_duplicate.getstingdupciate(), this);
        MovieRv.setAdapter(movieAdapter);
        MovieRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
    }

    private void viewslides_dupicate() {
        //Component Slides
        lastSlides = new ArrayList<>();
        lastSlides.add(new slides_itm(R.drawable.re2,"Resident Eviel 2"));
        lastSlides.add(new  slides_itm(R.drawable.horizon_gmae,""));
        lastSlides.add(new  slides_itm(R.drawable.forgoten_saga,""));
        lastSlides.add(new  slides_itm(R.drawable.black_dessert,""));

        SlidesPages adapter = new SlidesPages(this,lastSlides);
        sliderPager.setAdapter(adapter);


        //Component slides movie
        //Timer For slides Movie

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new sliderTimer(), 4000, 6000);
    }

    private void viewsin_duplicate() {
        sliderPager = findViewById(R.id.slider_img);
        MovieRv = findViewById(R.id.rycle_view);
        MovieRvWomen = findViewById(R.id.rycle_view_women);
    }

    @Override
    public void MovieClick(Movies movies, ImageView movieViewImage){
        Intent intent = new Intent(this, Detail_Games.class);
        intent.putExtra("title",movies.getTitle());
        intent.putExtra("imgURL",movies.getThumnail());
        intent.putExtra("imgCover",movies.getPhotoCover());

        // Animation Start when the item was click
        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity2s.this, movieViewImage, "transisi1");
        startActivity(intent,activityOptions.toBundle());

        Toast.makeText(this,"" + movies.getTitle(),Toast.LENGTH_SHORT).show();
    }

    class sliderTimer extends TimerTask{
        @Override
        public void run() {
          MainActivity2s.this.runOnUiThread(new Runnable() {
              @Override
              public void run() {
                if (sliderPager.getCurrentItem()<lastSlides.size()-1) {
                    sliderPager.setCurrentItem(sliderPager.getCurrentItem()+1);
                }
                else
                    sliderPager.setCurrentItem(0);
              }
          });
        }
    }
}