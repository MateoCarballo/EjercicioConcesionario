import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idCoche = 0;
        int entradaTeclado = 0;

        Coche[] miConcesionario = new Coche[10];

        for (int i = 0; i < miConcesionario.length; i++) {
            miConcesionario[i] = new Coche(
                                            Coche.marcas[Coche.numAleatorioI(0,Coche.marcas.length-1)],
                                            Coche.tiposDeModelo[Coche.numAleatorioI(0,Coche.tiposDeModelo.length-1)],
                                            Coche.motorizacion[Coche.numAleatorioI(0,Coche.motorizacion.length-1)],
                                            Coche.numAleatorioI(15000,35000),
                                            Coche.booleanoAleatorio(),
                                            Coche.booleanoAleatorio(),
                                            Coche.booleanoAleatorio());
            miConcesionario[i].setIdCoche(idCoche);
            idCoche++;
        }
        System.out.println("""
                Concesionario
                1 (rellenar campos manual)
                2 Ordenar por precioBase con metodo burbuja""");

        entradaTeclado = 2;
        System.out.println("ANTES DE ORDENAR");
        for (int i = 0; i < miConcesionario.length ; i++) {
            System.out.println(miConcesionario[i].toString());
        }

        switch (entradaTeclado) {
            case 1:
                /**
                 * Carga.carga(coche);
                 */

                //Listado ordenado
            case 2:


                System.out.println("DESPUES DE ORDENAR");

                Operaciones.burbuja(miConcesionario);
                for (int i = 0; i < miConcesionario.length ; i++) {
                    System.out.println(miConcesionario[i]);
                }

                break;

                /**
                 * Ordenar.MayorMenorBurbuja(coche);//uso método burbuja
                 *                 Ver.verArray(coche);
                 */

                //Coche más caro
            case 3:
                /**
                 * Ordenar.MayorPrecio(coche);//ordenación secuencial por precio_base
                 */

                //Busqueda
            case 4:
                /**
                 * Buscar.buscaDicotomica(coche);
                 */
                //búsqueda binaria o dicotómica
            case 5:
                /**
                 * Ver.verArray(coche);
                 */
                //Salir
            case 0:
                //Error
            default:
                System.out.println("Opción no válida");
        }
    }
}
