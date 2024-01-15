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
}