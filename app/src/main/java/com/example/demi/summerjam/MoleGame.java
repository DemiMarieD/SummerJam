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
    ImageButton e;
    ImageButton f;
    ImageButton g;
    ImageButton h;
    ImageButton i;
    ImageButton j;
    ImageButton k;
    ImageButton l;
    ImageButton m;
    ImageButton n;
    ImageButton o;
    ImageButton p;
    ImageButton q;
    ImageButton r;
    ImageButton s;
    ImageButton t;
    ImageButton u;
    ImageButton v;
    ImageButton w;
    ImageButton x;
    ImageButton y;
    int max=24;

    ProgressBar progressBar;
    CountDownTimer countDownTimer;
    TextView score;
    int points =0;
    int target;
    ImageButton oldT;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myGame = inflater.inflate(R.layout.mole_layout, container, false);

        score = (TextView) myGame.findViewById(R.id.score);
        progressBar = (ProgressBar) myGame.findViewById(R.id.timer);


        //toDo: make Countdown/timer
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
        e = (ImageButton) myGame.findViewById(R.id.btn4);
        f = (ImageButton) myGame.findViewById(R.id.btn5);
        g = (ImageButton) myGame.findViewById(R.id.btn6);
        h = (ImageButton) myGame.findViewById(R.id.btn7);
        i = (ImageButton) myGame.findViewById(R.id.btn8);
        j = (ImageButton) myGame.findViewById(R.id.btn9);
        k = (ImageButton) myGame.findViewById(R.id.btn10);
        l = (ImageButton) myGame.findViewById(R.id.btn11);
        m = (ImageButton) myGame.findViewById(R.id.btn12);
        n = (ImageButton) myGame.findViewById(R.id.btn13);
        o = (ImageButton) myGame.findViewById(R.id.btn14);
        p = (ImageButton) myGame.findViewById(R.id.btn15);
        q = (ImageButton) myGame.findViewById(R.id.btn16);
        r = (ImageButton) myGame.findViewById(R.id.btn17);
        s = (ImageButton) myGame.findViewById(R.id.btn18);
        t = (ImageButton) myGame.findViewById(R.id.btn19);
        u = (ImageButton) myGame.findViewById(R.id.btn20);
        v = (ImageButton) myGame.findViewById(R.id.btn21);
        w = (ImageButton) myGame.findViewById(R.id.btn22);
        x = (ImageButton) myGame.findViewById(R.id.btn23);
        y = (ImageButton) myGame.findViewById(R.id.btn24);
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
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(4);
                setRandomImage();
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(5);
                setRandomImage();
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(6);
                setRandomImage();
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(7);
                setRandomImage();
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(8);
                setRandomImage();
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(9);
                setRandomImage();
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(10);
                setRandomImage();
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(11);
                setRandomImage();
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(12);
                setRandomImage();
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(13);
                setRandomImage();
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(14);
                setRandomImage();
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(15);
                setRandomImage();
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(16);
                setRandomImage();
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(17);
                setRandomImage();
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(18);
                setRandomImage();
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(19);
                setRandomImage();
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(20);
                setRandomImage();
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(21);
                setRandomImage();
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(22);
                setRandomImage();
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(23);
                setRandomImage();
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHit(24);
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
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            a.setImageResource(R.drawable.mole_hair);
            target = 0;
            oldT = a;

        }else if (randomNum == 1){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            b.setImageResource(R.drawable.mole_hair);
            target = 1;
            oldT = b;

        }else if (randomNum == 2){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            c.setImageResource(R.drawable.mole_hair);
            target =2;
            oldT = c;
        }else if (randomNum == 3){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            d.setImageResource(R.drawable.mole_hair);
            target = 3;
            oldT = d;
        }if(randomNum==4){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            e.setImageResource(R.drawable.mole_hair);
            target =4;
            oldT = e;

        }else if (randomNum == 5){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            f.setImageResource(R.drawable.mole_hair);
            target = 5;
            oldT = f;

        }else if (randomNum == 6){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            g.setImageResource(R.drawable.mole_hair);
            target =6;
            oldT = g;
        }else if (randomNum == 7){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
           h.setImageResource(R.drawable.mole_hair);
            target = 7;
            oldT = h;
        }if(randomNum==8){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            i.setImageResource(R.drawable.mole_hair);
            target = 8;
            oldT = i;

        }else if (randomNum == 9){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            j.setImageResource(R.drawable.mole_hair);
            target = 9;
            oldT = j;

        }else if (randomNum == 10){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            k.setImageResource(R.drawable.mole_hair);
            target =10;
            oldT = k;
        }else if (randomNum == 11){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            l.setImageResource(R.drawable.mole_hair);
            target = 11;
            oldT = l;
        }if(randomNum==12){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            m.setImageResource(R.drawable.mole_hair);
            target = 12;
            oldT = m;

        }else if (randomNum == 13){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
           n.setImageResource(R.drawable.mole_hair);
            target = 13;
            oldT = n;

        }else if (randomNum == 14){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            o.setImageResource(R.drawable.mole_hair);
            target =14;
            oldT = o;
        }else if (randomNum == 15){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            p.setImageResource(R.drawable.mole_hair);
            target = 15;
            oldT =p;
        }else if (randomNum == 16){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            q.setImageResource(R.drawable.mole_hair);
            target =16;
            oldT = q;
        }else if (randomNum == 17){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            r.setImageResource(R.drawable.mole_hair);
            target = 17;
            oldT = r;
        }if(randomNum==18){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            s.setImageResource(R.drawable.mole_hair);
            target = 18;
            oldT = s;

        }else if (randomNum == 19){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            t.setImageResource(R.drawable.mole_hair);
            target = 19;
            oldT = t;

        }else if (randomNum == 20){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            u.setImageResource(R.drawable.mole_hair);
            target =20;
            oldT = u;
        }else if (randomNum == 21){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            v.setImageResource(R.drawable.mole_hair);
            target = 21;
            oldT = v;
        }if(randomNum==22){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
           w.setImageResource(R.drawable.mole_hair);
            target = 22;
            oldT = w;

        }else if (randomNum == 23){
            if(oldT!=null) {
                oldT.setImageResource(R.drawable.mole);
            }
            x.setImageResource(R.drawable.mole_hair);
            target = 23;
            oldT = x;

        }else if (randomNum == 24) {
            if (oldT != null) {
                oldT.setImageResource(R.drawable.mole);
            }
            y.setImageResource(R.drawable.mole_hair);
            target = 24;
            oldT = y;
        }
    }

}
