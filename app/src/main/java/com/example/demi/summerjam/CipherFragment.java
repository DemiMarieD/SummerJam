package com.example.demi.summerjam;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Demi on 12.07.2017.
 */

public class CipherFragment extends Fragment{

    View myCipher;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myCipher = inflater.inflate(R.layout.cipher_layout, container, false);
        return myCipher;
    }
}
