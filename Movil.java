public class Movil {
    private boolean encendido;
    private String numeroDeTelefono;
    private Teclado teclado;
    
    public Movil(int numero) {
        encendido = false;
        numeroDeTelefono = "000000000";
        teclado = new Teclado();
    }
    
    public void cambiarNumero(String numero) {
        if (numero.length() != 9) {
            System.out.println("Error, numero de tel�fono inexistente por favor int�ntelo de nuevo");
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
        System.out.println("El movil est�: " + cambio + " |El n�mero de telefono es: " + numeroDeTelefono);
    }
    
    public void anadirTeclado() {
        
    }
}