# android-calculadora

Para realizar este ejercicio se ha considerado las siguientes funciones que tiene una calculadora científica:



Para realizar este ejercicio se ha considerado las siguientes funciones que tiene una calculadora científica con funciones que nos proporciona la librería Math. 

-	Funciones trigonométricas  
    - Seno 
    - Coseno 
    - Tangente 
-	Funciones Logarítmicas y exponenciales
    - Logaritmo natural 
    -	Logaritmo base 10 
    -	Exponencial 
-	Funciones matemáticas 
    -	Porcentaje 
    -	Potencia 
    -	Raíz cuadrada

Para la ejecución de estas se ha optado por usar una función onClick que este a la escucha de la pulsación de los botones de la pantalla. 
Dentro de esta se tiene una sentencia switch en la cual vamos a tener diferentes opciones, en las que se puede ofrecer un resultado inmediato como raíz cuadrada o funciones como seno o coseno se tiene la función directo. 
En caso de tener que pulsar el botón de igual dentro del cual dependiendo el botón se efectuara determinada operación.


```javascript
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

                      ....
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
                    break;
                    ...
                      }
           } catch (Exception e) {
            pantalla.setText(" Error");
        }
     }
        
```




## Funcionamiento de la aplicación 

![Alt Text](https://raw.githubusercontent.com/CarlosMaldonado1998/android-calculadora/master/Images/funcionamiento.gif)

