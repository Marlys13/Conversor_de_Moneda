package Model;

public class Calculadora {
    private double divisaConvertida;

    public double getDivisaConvertida() {
        return divisaConvertida;
    }

    public void convierte (DivisaDestino divisaDestino, double factorConversor){
        this.divisaConvertida = factorConversor * divisaDestino.getValorRelativo();
    }
}
