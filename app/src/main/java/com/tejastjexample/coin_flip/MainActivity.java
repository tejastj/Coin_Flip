package com.tejastjexample.coin_flip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b_flip;
    ImageView iv_coin;
    Random r;
    int coin_side;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_coin= (ImageView)findViewById(R.id.iv_coin);
        b_flip = (Button)findViewById(R.id.b_flip);
        r = new Random();



        b_flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coin_side = r.nextInt(2);
                if(coin_side==0){
                    iv_coin.setImageResource(R.drawable.head);
                    Toast.makeText(MainActivity.this,"Heads",Toast.LENGTH_SHORT).show();

                }else{
                    iv_coin.setImageResource(R.drawable.tail);
                    Toast.makeText(MainActivity.this,"Tails",Toast.LENGTH_SHORT).show();

                }

                RotateAnimation rotateAnimation = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                rotateAnimation.setDuration(1000);
                iv_coin.startAnimation(rotateAnimation);

            }
        });




    }
}
