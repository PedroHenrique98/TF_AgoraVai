import java.time.LocalDate;

public class Abastecimento {
    private int codAutomovel;

    private String tipoCombustivel;

    private LocalDate data;

    private double odometroAtual;

    private double litros;

    private double precoLitro;

    private double precoTotal;

    public Abastecimento(int auto, String tc, double oa, double l, double pl) {
        codAutomovel = auto;
        tipoCombustivel = tc;
        odometroAtual = oa;
        litros = l;
        precoLitro = pl;
        precoTotal = litros*precoLitro;
        data = LocalDate.now();
    }

    @Override
    public String toString() {
        return "\nCodigo Automóvel: " + codAutomovel + "\nTipo de Combustível: " + tipoCombustivel +"\nData do Abastecimento: " + data.toString() + "\nOdometro Atual"
                + odometroAtual + "\nLitros Abastecidos: " + litros + "\nPreço por litro: " + precoLitro
                + "\nPreço Total: " + precoTotal;
    }
}