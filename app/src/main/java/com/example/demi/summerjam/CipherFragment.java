package com.example.demi.summerjam;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Demi on 12.07.2017.
 */

public class CipherFragment extends Fragment{

    TextView titel;
    Button click;
    View myCipher;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myCipher = inflater.inflate(R.layout.cipher_layout, container, false);

        click = (Button) myCipher.findViewById(R.id.click_b);
        titel = (TextView) myCipher.findViewById(R.id.titel_tv);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titel.setText("clicked");
            }
        });

        return myCipher;
    }
}
