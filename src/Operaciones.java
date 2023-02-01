public class Operaciones {
    Operaciones(){

    }


    public static void burbuja (Coche miConcesionario[]){
        Coche aux = new Coche();
        int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<miConcesionario.length-1;i++){
                if (miConcesionario[i].precioBase>miConcesionario[i+1].precioBase){
                    //Intercambiamos valores
                    aux=miConcesionario[i];
                    miConcesionario[i]=miConcesionario[i+1];
                    miConcesionario[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }

    public static void burbujaPalabras (String lista_palabras[]){
        boolean ordenado=false;
        int cuentaIntercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        while(!ordenado){
            for(int i=0;i<lista_palabras.length-1;i++){
                if (lista_palabras[i].compareToIgnoreCase(lista_palabras[i+1])>0){
                    //Intercambiamos valores
                    String aux=lista_palabras[i];
                    lista_palabras[i]=lista_palabras[i+1];
                    lista_palabras[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaIntercambios=0;
        }

    }

}
