package entidades;

import entidades.ElementoInstalacao;

public class Tanque extends ElementoInstalacao {
    private double volumeEmLitros;

    public Tanque(double volumeEmLitros){
        this.volumeEmLitros = volumeEmLitros;
    }
}
