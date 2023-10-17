public class Carro implements Veiculo {
    private int quilometragem;
    private int anoFabricacao;
    private int maxPassageiros;

    public Carro(int quilometragem, int anoFabricacao, int maxPassageiros) {
        this.quilometragem = quilometragem;
        this.anoFabricacao = anoFabricacao;
        this.maxPassageiros = maxPassageiros;
    }

    @Override
    public boolean podeCarregar(int qtPassageiros) {
        return qtPassageiros <= maxPassageiros;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}

