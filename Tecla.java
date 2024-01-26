class Tecla {
    private boolean presionada;
    private String caracter;
    
    public Tecla(String selectedKey) {
        caracter = selectedKey;
        presionada = false;
    }
    
    public void presionar(){
        presionada = true;
    }
    
    public void cambiarCaracter(String changeSelectedKey){
        caracter = changeSelectedKey;
        presionada = false;
    }
    
    public void getDetails() {
        String cambio = "";
        if (presionada) {
            cambio = "presionada";
        }
        else {
            cambio = "no presionada";
        }
        System.out.println("La tecla est�: " + cambio + " |Tiene el caracter: " + caracter);
    }
}