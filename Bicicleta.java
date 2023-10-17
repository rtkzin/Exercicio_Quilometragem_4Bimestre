public class Bicicleta implements Veiculo {
    private int qtMarchas;
    private int maxPassageiros;
    private int marchaAtual;

    public Bicicleta(int qtMarchas, int maxPassageiros) {
        this.qtMarchas = qtMarchas;
        this.maxPassageiros = maxPassageiros;
        this.marchaAtual = 1; // A marcha inicial é 1
    }

    @Override
    public boolean podeCarregar(int qtPassageiros) {
        return qtPassageiros <= maxPassageiros;
    }

    public int getQtMarchas() {
        return qtMarchas;
    }

    public void aumentarMarcha() {
        if (marchaAtual < qtMarchas) {
            marchaAtual++;
        }
    }

    public void diminuirMarcha() {
        if (marchaAtual > 1) {
            marchaAtual--;
        }
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }
}

