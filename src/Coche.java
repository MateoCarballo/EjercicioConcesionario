import java.util.Random;

public class Coche {
    final static String[] marcas={"Audi","BMW","Cadillac","Peugeot","Kia"};
    final static String[] tiposDeModelo={"A","B","C","D"};
    final static String[] motorizacion= {"Gasolina","Diesel","Hibrido","Híbrido Enchufable","Eléctrico"};
    int idCoche;
    String marca;
    String modelo;
    String tipoMotor;
    double precioBase;
    boolean tieneAireAcondicionado;
    boolean tieneCierreCentralizado;
    boolean tienePinturaMetalizada;

    Coche(){

    }

    public Coche(String marca, String modelo, String tipoMotor, double precioBase, boolean tieneAireAcondicionado,
                 boolean tieneCierreCentralizado, boolean tienePinturaMetalizada) {
        this.marca = marca ;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.precioBase = precioBase;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCierreCentralizado = tieneCierreCentralizado;
        this.tienePinturaMetalizada = tienePinturaMetalizada;
    }

    public void setIdCoche(int idMiCoche) {
        this.idCoche = idMiCoche;
    }


    public static int numAleatorioI(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static double numAleatorio(double limInferior, double limSuperior){
        double aleatorio = (double)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static boolean booleanoAleatorio(){
        Random generador = new Random();
        boolean miBooleano = generador.nextBoolean();
        return miBooleano;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "idCoche=" + idCoche +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", precioBase=" + precioBase +
                ", tieneAireAcondicionado=" + tieneAireAcondicionado +
                ", tieneCierreCentralizado=" + tieneCierreCentralizado +
                ", tienePinturaMetalizada=" + tienePinturaMetalizada +
                '}';
    }
}

