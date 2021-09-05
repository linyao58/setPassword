package com.example.setpassword;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class setEdixttext implements TextWatcher {
    private Button button;
    private EditText[] text;

    public void SetMonitorEditText(final Button button, final EditText... text) {

        this.button = button;
        this.text = text;


        for (int i = 0; i < text.length; i++) {

            if (text[i] != null) {

                text[i].addTextChangedListener(setEdixttext.this);
            }

        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {


        for (int i = 0; i < text.length; i++) {

            if (text[i].length() == 0) {
                button.setBackgroundResource(R.color.colorAccent);
                button.setEnabled(false);
                return;//这句代码值两千万
            } else {

                button.setBackgroundResource(R.color.colorPrimaryDark);
                button.setEnabled(true);

            }
        }

    }
}
