class Tecla {
    private boolean presionada;
    private String caracter;
    
    public void Tecla(String selectedKey) {
        caracter = selectedKey;
        presionada = false;
    }
}