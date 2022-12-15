package utils;

import com.example.login.R;

import java.util.ArrayList;
import java.util.List;

import Models.Movies;

public class SourceDt_duplicate {

    public static List<Movies> getstingdupciate(){
        List<Movies> lstMovie = new ArrayList<>();
        lstMovie.add(new Movies("Assasins Creed Revelations", R.drawable.assinscreedbg ,R.drawable.assasinscreeedrevelations));
        lstMovie.add(new Movies("Call Of Duty Black Ops",R.drawable.callofdutymainpc, R.drawable.callofdutygameplay));
        lstMovie.add(new Movies("Resident Evil Biohazard",R.drawable.re_biohazard, R.drawable.re_gameplay));
        lstMovie.add(new Movies("Moto Gp 2020",R.drawable.motogp20, R.drawable.motogp_gampelay));
        return lstMovie;
    }
    public static List<Movies>getMovieRvWmn(){

        List<Movies> lstMovie = new ArrayList<>();
        lstMovie.add(new Movies("360 Caci", R.drawable.cacitheme ,R.drawable.cacigampelay));
        //lstMovie.add(new Movies("Simpel Barbershop",R.drawable.womenbarber, R.drawable.barber2));
        //lstMovie.add(new Movies("Mints Barbershop",R.drawable.babr3, R.drawable.barber3));
       // lstMovie.add(new Movies("Ada Barbershop",R.drawable.barber4, R.drawable.adabarber4));
        return lstMovie;
    }
}
