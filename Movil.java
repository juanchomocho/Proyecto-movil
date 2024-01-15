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
            System.out.println("Error, numero de teléfono inexistente por favor inténtelo de nuevo");
        }
        else {
            numeroDeTelefono = numero;
            System.out.println("Numero cambiado correctamente");
        }
    }
}