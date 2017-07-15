package com.example.demi.summerjam;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Demi on 12.07.2017.
 */

public class GameFragment extends Fragment {

    View myGame;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myGame = inflater.inflate(R.layout.game_layout, container, false);
        return myGame;
    }
}
