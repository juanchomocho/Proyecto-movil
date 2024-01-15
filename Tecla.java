class Tecla {
    private boolean presionada;
    private String caracter;
    
    public Tecla(String selectedKey) {
        caracter = selectedKey;
        presionada = false;
    }
}