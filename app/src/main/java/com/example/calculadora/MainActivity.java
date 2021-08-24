package com.example.calculadora;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// Author: COD3F1RE
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    // Inicializacion de las variables
    boolean raizene = false;
    boolean in = false;
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean divide = false;
    boolean exp  = false;
    boolean ra = false;
    boolean targ = false;
    boolean cos = false;
    boolean se = false;
    boolean log = false;
    boolean porc = false;
    boolean pow = false;
    Double[] numero = new Double [20];
    Double resultado ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button n0 = (Button) findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button) findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button) findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button) findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button) findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button) findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button) findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button) findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button) findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button) findViewById(R.id.btn9);
        n9.setOnClickListener(this);

        Button punto = (Button) findViewById(R.id.btnDot);
        punto.setOnClickListener(this);
        Button igual = (Button) findViewById(R.id.btnResult);
        igual.setOnClickListener(this);
        Button sumar = (Button) findViewById(R.id.btnSum);
        sumar.setOnClickListener(this);
        Button restar = (Button) findViewById(R.id.btnRest);
        restar.setOnClickListener(this);
        Button dividir = (Button) findViewById(R.id.btnDivide);
        dividir.setOnClickListener(this);
        Button multiplicar = (Button) findViewById(R.id.btnMulti);
        multiplicar.setOnClickListener(this);
        Button borrar = (Button) findViewById(R.id.btnClear);
        borrar.setOnClickListener(this);
        Button limpiar = (Button) findViewById(R.id.btnClearAll);
        limpiar.setOnClickListener(this);

        Button exp = (Button) findViewById(R.id.btnE);
        exp.setOnClickListener(this);
        Button expX = (Button) findViewById(R.id.btnEx);
        expX.setOnClickListener(this);
        Button seno = (Button) findViewById(R.id.btnSin);
        seno.setOnClickListener(this);
        Button coseno = (Button) findViewById(R.id.btnCos);
        coseno.setOnClickListener(this);
        Button tangente = (Button) findViewById(R.id.btnTan);
        tangente.setOnClickListener(this);
        Button porcentaje = (Button) findViewById(R.id.btnPercen);
        porcentaje.setOnClickListener(this);
        Button log = (Button) findViewById(R.id.btnLog);
        log.setOnClickListener(this);
        Button in = (Button) findViewById(R.id.btnLn);
        in.setOnClickListener(this);
        Button raiz = (Button) findViewById(R.id.btnSquareRot);
        raiz.setOnClickListener(this);
        Button pow = (Button) findViewById(R.id.btnPow);
        pow.setOnClickListener(this);
        Button pow2 = (Button) findViewById(R.id.btnPow2);
        pow2.setOnClickListener(this);
        Button pi = (Button) findViewById(R.id.btnPI);
        pi.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.textView2);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();
        try {
            switch (seleccion) {
                case R.id.btn0:
                    pantalla.setText(a + "0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a + "1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a + "2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a + "3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a + "4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a + "5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a + "6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a + "7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a + "8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a + "9");
                    break;
                case R.id.btnLog:
                    log = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log10(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnLn:
                    in = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnClearAll:
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnCos:
                    cos = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.cos(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnClear:
                    if(a.length() > 0){
                        String cadena = a.substring(0, a.length() - 1);
                        pantalla.setText(cadena);
                    }
                    break;
                case R.id.btnDivide:
                    divide = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnE:
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.E * numero[0];
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnPI:
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.PI * numero[0];
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnEx:
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.exp(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnResult:
                    numero[1] = Double.parseDouble(a);
                    if (suma == true) {
                        resultado = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (resta == true) {
                        resultado = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (multi == true) {
                        resultado = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (divide == true) {
                        resultado = numero[0] / numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (porc == true) {
                        resultado = (numero[0] * 100) / numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }  else if (pow == true) {
                        resultado = Math.pow(numero[0], numero[1]);
                        pantalla.setText(String.valueOf(resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multi = false;
                    divide = false;
                    exp = false;
                    ra = false;
                    targ = false;
                    cos = false;
                    se = false;
                    log = false;
                    porc = false;
                    in = false;
                    pow = false;
                    break;
                case R.id.btnMulti:
                    multi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnDot:
                    pantalla.setText(a + ".");
                    decimal = true;
                    if (decimal == false) {
                        pantalla.setText(a + ".");
                    } else {
                        return;
                    }
                    break;
                case R.id.btnSquareRot:
                    ra = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.sqrt(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnRest:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnSin:
                    se = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.sin(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnPercen:
                    porc = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnSum:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnPow:
                    pow = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnTan:
                    targ = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.tan(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnPow2:
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.pow(numero[0], 2);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
            }
        } catch (Exception e) {
            pantalla.setText(" Error");
        }
        ;

    }
}