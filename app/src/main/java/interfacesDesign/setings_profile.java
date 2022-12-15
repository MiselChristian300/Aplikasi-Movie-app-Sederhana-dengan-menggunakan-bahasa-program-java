package interfacesDesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.login.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class setings_profile extends AppCompatActivity {
    ImageView imageView;
    CircleImageView circleImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seting_profile);
        imageView = (ImageView) findViewById(R.id.shops);
        //Text close
        circleImageView = (CircleImageView) findViewById(R.id.circleImageViewclose_2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                {order();}
            }
            public void order(){
                Intent intent = new Intent(setings_profile.this, order.class);
                startActivity(intent);
            }
        });
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {MainActivity2s();}{

            }
            public void MainActivity2s(){
                Intent intent = new Intent(setings_profile.this,MainActivity2s.class);
                startActivity(intent);

            }
        });
    }
}