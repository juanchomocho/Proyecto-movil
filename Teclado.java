public class Teclado {
    private String alfabeto;
    private int numeroDeTeclas;
    private Tecla tecla;

    public Teclado(){
        alfabeto = "espanol";
        numeroDeTeclas = 42;
        tecla = new Tecla("a");
        tecla = new Tecla("b");
        tecla = new Tecla("c");
        tecla = new Tecla("d");
        tecla = new Tecla("e");
        tecla = new Tecla("f");
        tecla = new Tecla("g");
        tecla = new Tecla("h");
        tecla = new Tecla("i");
        tecla = new Tecla("j");
        tecla = new Tecla("k");
        tecla = new Tecla("l");
        tecla = new Tecla("m");
        tecla = new Tecla("n");
        tecla = new Tecla("o");
        tecla = new Tecla("p");
        tecla = new Tecla("q");
        tecla = new Tecla("r");
        tecla = new Tecla("s");
        tecla = new Tecla("t");
        tecla = new Tecla("u");
        tecla = new Tecla("v");
        tecla = new Tecla("w");
        tecla = new Tecla("x");
        tecla = new Tecla("y");
        tecla = new Tecla("z");
    }

    /**
     * Cambia el idioma
     */
    public void cambiarIdioma(String alfabetoCambiado){
        alfabeto = alfabetoCambiado;
    }

}