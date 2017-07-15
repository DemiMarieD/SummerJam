package com.example.demi.summerjam;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.concurrent.ThreadLocalRandom;


/**
 * Created by Demi on 15.07.2017.
 */

public class MoleGame extends Fragment {

    View myGame;
    ImageButton a;
    ImageButton b;
    ImageButton c;
    ImageButton d;
    int max=4;

    ProgressBar progressBar;
    CountDownTimer countDownTimer;
    TextView score;
    int points =0;
    int target;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myGame = inflater.inflate(R.layout.mole_layout, container, false);

        score = (TextView) myGame.findViewById(R.id.score);
        progressBar = (ProgressBar) myGame.findViewById(R.id.timer);

        /*
        countDownTimer = new CountDownTimer(length_in_milliseconds,period_in_milliseconds) {
            private boolean warned = false;
            @Override
            public void onTick(long millisUntilFinished_) {
                progressBar.progress = (length_in_milliseconds-millisUntilFinished_)/lenght_in_milliseconds*100.0;
            }

            @Override
            public void onFinish() {
                // do whatever when the bar is full
            }
        }.start();
        */

        a = (ImageButton) myGame.findViewById(R.id.btn0);
        b = (ImageButton) myGame.findViewById(R.id.btn1);
        c = (ImageButton) myGame.findViewById(R.id.btn2);
        d = (ImageButton) myGame.findViewById(R.id.btn3);
        setRandomImage();

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(0);
                setRandomImage();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(1);
                setRandomImage();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(2);
                setRandomImage();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(3);
                setRandomImage();
            }
        });

        return myGame;
    }


    /**
     * To change the score if the right image is hit
     * @param x
     */
    public void isHit(int x){
        if (x == target){
            points++;
        }
        score.setText("Score: " + points);
    }

    /**
     * To change the image random
     */
    public void setRandomImage(){

        Random rand = new Random();
        int randomNum = rand.nextInt(max+1);

        if(randomNum==0){
            a.setImageResource(R.drawable.mole_hair);
            target = 0;

            b.setImageResource(R.drawable.mole);
            c.setImageResource(R.drawable.mole);
            d.setImageResource(R.drawable.mole);

        }else if (randomNum == 1){
            b.setImageResource(R.drawable.mole_hair);
            target = 1;

            a.setImageResource(R.drawable.mole);
            c.setImageResource(R.drawable.mole);
            d.setImageResource(R.drawable.mole);

        }else if (randomNum == 2){
            c.setImageResource(R.drawable.mole_hair);
            target = 2;

            b.setImageResource(R.drawable.mole);
            a.setImageResource(R.drawable.mole);
            d.setImageResource(R.drawable.mole);

        }else if (randomNum == 3){
            d.setImageResource(R.drawable.mole_hair);
            target = 3;

            b.setImageResource(R.drawable.mole);
            c.setImageResource(R.drawable.mole);
            a.setImageResource(R.drawable.mole);

        }

    }

}
