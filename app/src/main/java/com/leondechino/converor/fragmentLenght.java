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

public class fragmentLenght extends Fragment implements View.OnClickListener {

    View view;

    private EditText txtInput;
    private Spinner spinner1, spinner2;
    private TextView lbl;
    private Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_lenght, container, false);
        txtInput = (EditText) view.findViewById(R.id.txtLenght);
        spinner1 = (Spinner) view.findViewById(R.id.spLenght);
        spinner2 = (Spinner) view.findViewById(R.id.spLenght2);
        btn = (Button) view.findViewById(R.id.btnLenght);
        lbl = (TextView) view.findViewById(R.id.lblLenght);
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
        if (sp1.equals("Centímetros")){
            if (sp2.equals("Metros")){
                lbl.setText((input/100)+" Metros");
            } else if (sp2.equals("Kilómetros")) {
                lbl.setText((input/100000)+" Kilómetros");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/2.54)+" Pulgadas");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/453.592)+" Pies");
            }else if (sp2.equals("Yardas")) {
                lbl.setText((input/1000000)+" Yardas");
            }else if (sp2.equals("Millas")) {
                lbl.setText((input/1000000)+" Millas");
            }
        }
        if (sp1.equals("Metros")){
            if (sp2.equals("Centímetros")){
                lbl.setText((input*100)+" Centímetros");
            } else if (sp2.equals("Kilómetros")) {
                lbl.setText((input/1000)+" Kilómetros");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/1000)+" Pulgadas");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/453.592)+" Pies");
            }else if (sp2.equals("Yardas")) {
                lbl.setText((input/1000000)+" Yardas");
            }else if (sp2.equals("Millas")) {
                lbl.setText((input/1000000)+" Millas");
            }
        }
        if (sp1.equals("Kilómetros")){
            if (sp2.equals("Centímetros")){
                lbl.setText((input*100000)+" Centímetros");
            } else if (sp2.equals("Metros")) {
                lbl.setText((input*1000)+" Metros");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/1000)+" Pulgadas");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/453.592)+" Pies");
            }else if (sp2.equals("Yardas")) {
                lbl.setText((input/1000000)+" Yardas");
            }else if (sp2.equals("Millas")) {
                lbl.setText((input/1000000)+" Millas");
            }
        }
        if (sp1.equals("Pulgadas")){
            if (sp2.equals("Centímetros")){
                lbl.setText((input*2.54)+" Centímetros");
            } else if (sp2.equals("Metros")) {
                lbl.setText((input/1000)+" Metros");
            }else if (sp2.equals("Kilómetros")) {
                lbl.setText((input/1000)+" Kilómetros");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/12)+" Pies");
            }else if (sp2.equals("Yardas")) {
                lbl.setText((input/1000000)+" Yardas");
            }else if (sp2.equals("Millas")) {
                lbl.setText((input/1000000)+" Millas");
            }
        }
        if (sp1.equals("Pies")){
            if (sp2.equals("Centímetros")){
                lbl.setText((input)+" Centímetros");
            } else if (sp2.equals("Metros")) {
                lbl.setText((input/1000)+" Metros");
            }else if (sp2.equals("Kilómetros")) {
                lbl.setText((input/1000)+" Kilómetros");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input*12)+" Pulgadas");
            }else if (sp2.equals("Yardas")) {
                lbl.setText((input/24)+" Yardas");
            }else if (sp2.equals("Millas")) {
                lbl.setText((input/1000000)+" Millas");
            }
        }
        if (sp1.equals("Yardas")){
            if (sp2.equals("Centímetros")){
                lbl.setText((input)+" Centímetros");
            } else if (sp2.equals("Metros")) {
                lbl.setText((input/1000)+" Metros");
            }else if (sp2.equals("Kilómetros")) {
                lbl.setText((input/1000)+" Kilómetros");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/453.592)+" Pulgadas");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input*24)+" ");
            }else if (sp2.equals("Millas")) {
                lbl.setText((input/1000000)+" Millas");
            }
        }
        if (sp1.equals("Millas")){
            if (sp2.equals("Centímetros")){
                lbl.setText((input)+" Centímetros");
            } else if (sp2.equals("Metros")) {
                lbl.setText((input/1000)+" Metros");
            }else if (sp2.equals("Kilómetros")) {
                lbl.setText((input/1000)+" Kilómetros");
            }else if (sp2.equals("Pulgadas")) {
                lbl.setText((input/453.592)+" Pulgadas");
            }else if (sp2.equals("Pies")) {
                lbl.setText((input/1000000)+" ");
            }else if (sp2.equals("Yardas")) {
                lbl.setText((input/1000000)+" Yardas");
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
                if (value.equals("Metros")) {
                    if (value2.equals("Centimetros")) {

                        valor1 = valor1 * 100;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Millas")) {
                        valor1 = valor1 / 1609;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Yardas")) {
                        valor1 = valor1 * 1.09361;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 * 3.281;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pulgadas")) {
                        valor1 = valor1 * 39.3701;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    }
                } else if (value.equals("Centimetros")) {
                    if (value2.equals("Metros")) {

                        valor1 = valor1 / 100;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Millas")) {
                        valor1 = valor1 / 160900;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Yardas")) {
                        valor1 = valor1 / 91.44;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 / 30.48;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pulgadas")) {
                        valor1 = valor1 / 2.54;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    }
                } else if (value.equals("Millas")) {
                    if (value2.equals("Centimetros")) {

                        valor1 = valor1 * 160934;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 * 1609;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Yardas")) {
                        valor1 = valor1 * 1760;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 * 5280;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pulgadas")) {
                        valor1 = valor1 * 63360;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    }
                } else if (value.equals("Yardas")) {
                    if (value2.equals("Centimetros")) {

                        valor1 = valor1 * 91.44;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Millas")) {
                        valor1 = valor1 / 1760;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 / 1.094;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 * 3;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pulgadas")) {
                        valor1 = valor1 * 36;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    }
                } else if (value.equals("Pies")) {
                    if (value2.equals("Centimetros")) {

                        valor1 = valor1 * 30.48;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Millas")) {
                        valor1 = valor1 / 5280;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Yardas")) {
                        valor1 = valor1 / 3;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 / 3.281;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pulgadas")) {
                        valor1 = valor1 * 12;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    }
                } else if (value.equals("Pulgadas")) {
                    if (value2.equals("Centimetros")) {

                        valor1 = valor1 * 2.54;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Millas")) {
                        valor1 = valor1 / 63360;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Yardas")) {
                        valor1 = valor1 / 36;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Pies")) {
                        valor1 = valor1 / 12;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    } else if (value2.equals("Metros")) {
                        valor1 = valor1 / 39.37;
                        String result = String.valueOf(valor1);
                        lbl.setText(result);
                    }
                }
            }
        }
    }
}