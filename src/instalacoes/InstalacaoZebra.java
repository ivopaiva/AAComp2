package instalacoes;

import entidades.Jaula;

public class InstalacaoZebra extends Instalacao {
    public InstalacaoZebra(double temperatura, int capacidadeMaxima, double altura, double largura, double comprimento){
        this.setTemperatura(temperatura);
        this.setCapacidadeMaxima(capacidadeMaxima);
        Jaula jaula = new Jaula(altura, largura, comprimento);
        this.setElementosInstalados(jaula);
    }
}
