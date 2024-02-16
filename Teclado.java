import java.util.ArrayList;
public class Teclado {
    private String alfabeto;
    private int numeroDeTeclas;
    private ArrayList<Tecla> teclas;

    public Teclado(){
        alfabeto = "espanol";
        numeroDeTeclas = 42;
        teclas = new ArrayList<Tecla>();
    }

    /**
     * Cambia el idioma
     */
    public void cambiarIdioma(String alfabetoCambiado){
        alfabeto = alfabetoCambiado;
    }

    public void getDetails() {
        System.out.println("El movil está en: " + alfabeto + " |El teclado tiene: " + numeroDeTeclas + " teclas");
    }

    public void anadirTecla(String caracter) {
        teclas.add(new Tecla(caracter));
        System.out.println("Tecla añadida correctamente");
    }
}