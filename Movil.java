import java.util.ArrayList;
public class Movil {
    private boolean encendido;
    private String numeroDeTelefono;
    private ArrayList<Teclado> teclados;
    public Movil(int numero) {
        encendido = false;
        numeroDeTelefono = "000000000";
        teclados = new ArrayList<Teclado>();
    }

    public void cambiarNumero(String numero) {
        if (numero.length() != 9) {
            System.out.println("Error, numero de teléfono inexistente por favor inténtelo de nuevo");
        }
        else {
            numeroDeTelefono = numero;
            System.out.println("Numero cambiado correctamente");
        }
    }

    public void llamar(String introducirNumero){
        String numeroDestino = introducirNumero;
        System.out.println("LLamada realizada al numero: " + numeroDestino);
    }

    public void getDetails() {
        String cambio = "";
        if (encendido) {
            cambio = "encendido";
        }
        else {
            cambio = "apagado";
        }
        System.out.println("El movil está: " + cambio + " |El número de telefono es: " + numeroDeTelefono);
    }

    public void anadirTeclado() {
        teclados.add(new Teclado());
        System.out.println("Teclado añadido correctamente");
    }
}