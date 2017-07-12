package com.example.demi.summerjam;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * Created by Demi on 12.07.2017.
 */

public class CipherFragment extends Fragment{

    TextView ceasar;
    Button cipher;
    View myCipher;
    EditText key;
    EditText inputText;
    String finalText;
    Integer number;
    Integer length;
    int result;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myCipher = inflater.inflate(R.layout.cipher_layout, container, false);

        cipher = (Button) myCipher.findViewById(R.id.cipher);
        ceasar = (TextView) myCipher.findViewById(R.id.Ceasar);
        key=(EditText)myCipher.findViewById(R.id.Key) ;
        inputText=(EditText)myCipher.findViewById(R.id.inputText) ;

        cipher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalText = "Solution: ";
                number = Integer.parseInt(key.getText().toString());

                if(number >= 26){
                    number = number%26;
                }
                length= inputText.length();
                Editable decode = inputText.getText();

                for (int i=0; i < length; i++ ){
                    Character letter = decode.charAt(i);
                    result = (int)letter+ number;

                    if( isUpperCase(letter) && (result > 'Z')){
                        result = result -26;
                    }else if( isLowerCase(letter) && (result > 'z')){
                        result = result -26;
                    }

                    if(Character.isLetter(letter)){
                        finalText = finalText + (char) result;
                    }else {
                        finalText = finalText + letter;
                    }

                }

                ceasar.setText(finalText);
            }
        });

        return myCipher;
    }
}
