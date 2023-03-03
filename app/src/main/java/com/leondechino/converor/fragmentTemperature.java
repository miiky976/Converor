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
import android.widget.Toast;

public class fragmentTemperature extends Fragment implements View.OnClickListener {

    View view;

    private EditText txtInput;
    private Spinner spinner1, spinner2;
    private TextView lbl;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_temperature, container, false);
        txtInput = (EditText) view.findViewById(R.id.txtTeperature);
        spinner1 = (Spinner) view.findViewById(R.id.spTemperture);
        spinner2 = (Spinner) view.findViewById(R.id.spTemperature2);
        btn = (Button) view.findViewById(R.id.btnTemperature);
        lbl = (TextView) view.findViewById(R.id.lblTamperature);
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
        if (sp1.equals("Kelvin")){
            if (sp2.equals("Fahrenheit")){
                lbl.setText(((input-273.15*9/5)+32)+" Fahrenheit");
            } else if (sp2.equals("Celsius")) {
                lbl.setText((input-273.15)+" Celsius");
            }
        }
        if (sp1.equals("Fahrenheit")){
            if (sp2.equals("Kelvin")){
                lbl.setText(((input+459.67)*5/9)+" Kelvin");
            } else if (sp2.equals("Celsius")) {
                lbl.setText(((input-32)*5/9)+" Celsius");
            }
        }
        if (sp1.equals("Celsius")){
            if (sp2.equals("Kelvin")){
                lbl.setText((input+273.15)+" Kelvin");
            } else if (sp2.equals("Fahrenheit")) {
                lbl.setText(((input*9/5)+32)+" Fahrenheit");
            }
        }
    }

}