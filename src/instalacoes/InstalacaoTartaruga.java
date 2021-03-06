package instalacoes;

import entidades.Tanque;

public class InstalacaoTartaruga extends Instalacao {
    public InstalacaoTartaruga(double temperatura, int capacidadeMaxima, double volumeEmLitros){
        this.setTemperatura(temperatura);
        this.setCapacidadeMaxima(capacidadeMaxima);
        Tanque tanque = new Tanque(volumeEmLitros);
        this.setElementosInstalados(tanque);
    }
}
