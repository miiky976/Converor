package com.leondechino.converor;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class fragmentWeight extends Fragment implements View.OnClickListener {

    View view;

    private EditText txtInput;
    private Spinner spinner1, spinner2;
    private TextView lbl;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_weight, container, false);
        txtInput = (EditText) view.findViewById(R.id.txtWeight);
        spinner1 = (Spinner) view.findViewById(R.id.spWeight);
        spinner2 = (Spinner) view.findViewById(R.id.spWeight2);
        btn = (Button) view.findViewById(R.id.btnWeight);
        lbl = (TextView) view.findViewById(R.id.lblWeight);
        btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        if (txtInput.getText().toString() == null){
            return;
        } else if (txtInput.getText().toString().equals("")) {
            return;
        }
        String sp1 = spinner1.getSelectedItem().toString(), sp2 = spinner2.getSelectedItem().toString();
        float input = Float.parseFloat(txtInput.getText().toString());
        if (sp1.equals(sp2)){
            lbl.setText(input+" "+spinner2.getSelectedItem().toString());
        }
        if (sp1.equals("Gramos")){
            if (sp2.equals("Kilogramos")){
                lbl.setText((input/1000)+" Kilogramos");
            } else if (sp2.equals("Miligramos")) {
                lbl.setText((input*1000)+" Miligramos");
            }else if (sp2.equals("Onzas")) {
                lbl.setText((input/28.35)+" Onzas");
            }else if (sp2.equals("Libras")) {
                lbl.setText((input/453.592)+" Libras");
            }else if (sp2.equals("Toneladas")) {
                lbl.setText((input/1000000)+" Toneladas");
            }
        }
        if (sp1.equals("Kilogramos")){
            if (sp2.equals("Gramos")){
                lbl.setText((input*1000)+" Gramos");
            } else if (sp2.equals("Miligramos")) {
                lbl.setText((input*1000000)+" Miligramos");
            }else if (sp2.equals("Onzas")) {
                lbl.setText((input*35.274)+" Onzas");
            }else if (sp2.equals("Libras")) {
                lbl.setText((input*2.205)+" Libras");
            }else if (sp2.equals("Toneladas")) {
                lbl.setText((input/1000)+" Toneladas");
            }
        }
        if (sp1.equals("Miligramos")){
            if (sp2.equals("Gramos")){
                lbl.setText((input/1000)+" Gramos");
            } else if (sp2.equals("Kilogramos")) {
                lbl.setText((input/1000000)+" Kilogramos");
            }else if (sp2.equals("Onzas")) {
                lbl.setText((input/28350)+" Onzas");
            }else if (sp2.equals("Libras")) {
                lbl.setText((input/453592)+" Libras");
            }else if (sp2.equals("Toneladas")) {
                lbl.setText((input/1000000000)+" Toneladas");
            }
        }
        if (sp1.equals("Onzas")){
            if (sp2.equals("Gramos")){
                lbl.setText((input*28.35)+" Gramos");
            } else if (sp2.equals("Kilogramos")) {
                lbl.setText((input/35.274)+" Kilogramos");
            }else if (sp2.equals("Miligramos")) {
                lbl.setText((input*28350)+" Miligramos");
            }else if (sp2.equals("Libras")) {
                lbl.setText((input/16)+" Libras");
            }else if (sp2.equals("Toneladas")) {
                lbl.setText((input/35274)+" Toneladas");
            }
        }
        if (sp1.equals("Libras")){
            if (sp2.equals("Gramos")){
                lbl.setText((input*453.592)+" Gramos");
            } else if (sp2.equals("Kilogramos")) {
                lbl.setText((input/2.205)+" Kilogramos");
            }else if (sp2.equals("Miligramos")) {
                lbl.setText((input*453592)+" Miligramos");
            }else if (sp2.equals("Onzas")) {
                lbl.setText((input*16)+" Onzas");
            }else if (sp2.equals("Toneladas")) {
                lbl.setText((input/2204.62)+" Toneladas");
            }
        }
        if (sp1.equals("Toneladas")){
            if (sp2.equals("Gramos")){
                lbl.setText((input*1000000)+" Gramos");
            } else if (sp2.equals("Kilogramos")) {
                lbl.setText((input*1000)+" Kilogramos");
            }else if (sp2.equals("Miligramos")) {
                lbl.setText((input*1000000000)+" Miligramos");
            }else if (sp2.equals("Onzas")) {
                lbl.setText((input*35274)+" Onzas");
            }else if (sp2.equals("Libras")) {
                lbl.setText((input*2204.62)+" Libras");
            }
        }
    }
}