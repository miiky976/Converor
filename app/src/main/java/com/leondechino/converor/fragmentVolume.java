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

public class fragmentVolume extends Fragment implements View.OnClickListener {

    View view;

    private EditText txtInput;
    private Spinner spinner1, spinner2;
    private TextView lbl;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_volume, container, false);
        txtInput = (EditText) view.findViewById(R.id.txtVolume);
        spinner1 = (Spinner) view.findViewById(R.id.spVolume);
        spinner2 = (Spinner) view.findViewById(R.id.spVolume2);
        btn = (Button) view.findViewById(R.id.btnVolume);
        lbl = (TextView) view.findViewById(R.id.lblVolume);
        btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        /*if (txtInput.getText().toString() == null){
            return;
        } else if (txtInput.getText().toString().equals("")) {
            return;
        }
        String sp1 = spinner1.getSelectedItem().toString(), sp2 = spinner2.getSelectedItem().toString();
        float input = Float.parseFloat(txtInput.getText().toString());
        if (sp1.equals(sp2)){
            lbl.setText(input+" "+spinner2.getSelectedItem().toString());
        }
        if (sp1.equals("Mililitros")){
            if (sp2.equals("Centímetros")){
                lbl.setText((input)+" Centímetros³");
            } else if (sp2.equals("Litros")) {
                lbl.setText((input/1000)+" Litros");
            }else if (sp2.equals("Metros")) {
                lbl.setText((input/1000)+" Metros³");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/453.592)+" Pulgadas³");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/1000000)+" Pies³");
            }else if (sp2.equals("Galones")) {
                lbl.setText((input/1000000)+" Galones");
            }
        }
        if (sp1.equals("Centímetros")){
            if (sp2.equals("Mililitros")){
                lbl.setText((input)+" Mililitros");
            } else if (sp2.equals("Litros")) {
                lbl.setText((input/1000)+" Litros");
            }else if (sp2.equals("Metros")) {
                lbl.setText((input/1000)+" Metros³");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/453.592)+" Pulgadas³");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/1000000)+" Pies³");
            }else if (sp2.equals("Galones")) {
                lbl.setText((input/1000000)+" Galones");
            }
        }
        if (sp1.equals("Litros")){
            if (sp2.equals("Mililitros")){
                lbl.setText((input*1000)+" Mililitros");
            } else if (sp2.equals("Centímetros")) {
                lbl.setText((input*1000)+" Centímetros³");
            }else if (sp2.equals("Metros")) {
                lbl.setText((input)+" Metros³");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/453.592)+" Pulgadas³");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/1000000)+" Pies³");
            }else if (sp2.equals("Galones")) {
                lbl.setText((input/1000000)+" Galones");
            }
        }
        if (sp1.equals("Metros")){
            if (sp2.equals("Mililitros")){
                lbl.setText((input*1000)+" Mililitros");
            } else if (sp2.equals("Centímetros")) {
                lbl.setText((input*1000)+" Centímetros³");
            }else if (sp2.equals("Litros")) {
                lbl.setText((input)+" Litros");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/453.592)+" Pulgadas³");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/1000000)+" Pies³");
            }else if (sp2.equals("Galones")) {
                lbl.setText((input/1000000)+" Galones");
            }
        }
        if (sp1.equals("Pulgadas")){
            if (sp2.equals("Mililitros")){
                lbl.setText((input)+" Mililitros");
            } else if (sp2.equals("Centímetros")) {
                lbl.setText((input*1000)+" Centímetros³");
            }else if (sp2.equals("Litros")) {
                lbl.setText((input/28.35)+" Litros");
            }else if (sp2.equals("Metros")) {
                lbl.setText((input/453.592)+" Metros³");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/1000000)+" Pies³");
            }else if (sp2.equals("Galones")) {
                lbl.setText((input/1000000)+" Galones");
            }
        }
        if (sp1.equals("Pies")){
            if (sp2.equals("Mililitros")){
                lbl.setText((input)+" Mililitros");
            } else if (sp2.equals("Centímetros")) {
                lbl.setText((input*1000)+" Centímetros³");
            }else if (sp2.equals("Litros")) {
                lbl.setText((input/28.35)+" Litros");
            }else if (sp2.equals("Metros")) {
                lbl.setText((input/453.592)+" Metros³");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/1000000)+" Pulgadas³");
            }else if (sp2.equals("Galones")) {
                lbl.setText((input/1000000)+" Galones");
            }
        }
        if (sp1.equals("Galones")){
            if (sp2.equals("Mililitros")){
                lbl.setText((input)+" Mililitros");
            } else if (sp2.equals("Centímetros")) {
                lbl.setText((input*1000)+" Centímetros³");
            }else if (sp2.equals("Litros")) {
                lbl.setText((input/28.35)+" Litros");
            }else if (sp2.equals("Metros")) {
                lbl.setText((input/453.592)+" Metros³");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/1000000)+" Pulgadas³");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/1000000)+" Pies³");
            }
        }*/
        String value = spinner1.getSelectedItem().toString();
        String value2 = spinner2.getSelectedItem().toString();
        String stringValor1 = txtInput.getText().toString();
        if (stringValor1.isEmpty()){
            lbl.setText("Checa tus Digitos");
        } else {
            double valor1 = Double.parseDouble(stringValor1);
            if(valor1 <= 0){
                lbl.setText("Ingrese una Cantidad Valida");
            } else {

                if (value == value2) {
                    lbl.setText(valor1+"");return;
                }
                if (value.equals("Litros")) {
                    if (value2.equals("Mililitros")) {

                        valor1 = valor1 * 1000;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 / 1000;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Galones")) {
                        valor1 = valor1 / 3.785;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 / 28.317;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else {
                        lbl.setText("Error en la conversion revisa tus datos");
                    }
                } else if (value.equals("Mililitros")) {
                    if (value2.equals("Litros")) {

                        valor1 = valor1 / 1000;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 / 1000000;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Galones")) {
                        valor1 = valor1 / 3785;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 / 28320;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else {
                        lbl.setText("Error en la conversion revisa tus datos");
                    }
                } else if (value.equals("Metros")) {
                    if (value2.equals("Mililitros")) {

                        valor1 = valor1 * 1000000;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Litros")) {
                        valor1 = valor1 * 1000;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Galones")) {
                        valor1 = valor1 * 264.2;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 * 35.315;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else {
                        lbl.setText("Error en la conversion revisa tus datos");
                    }
                } else if (value.equals("Galones")) {
                    if (value2.equals("Mililitros")) {

                        valor1 = valor1 * 3785.41;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 / 264.2;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Litros")) {
                        valor1 = valor1 * 3.785;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 / 7.48;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else {
                        lbl.setText("Error en la conversion revisa tus datos");
                    }
                } else if (value.equals("Pies")) {
                    if (value2.equals("Mililitros")) {

                        valor1 = valor1 * 28320;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 / 35.315;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Galones")) {
                        valor1 = valor1 * 7.48052;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Litros")) {
                        valor1 = valor1 * 28.317;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else {
                        lbl.setText("Error en la conversion revisa tus datos");
                    }
                }


            }
        }
    }
}