package school.sptech.model;

public class Memoria extends Componente{
    public Memoria(int id, String tipo, Double uso) {
        super(id, tipo, uso);
    }

    public Memoria() {
    }

    @Override
    public Double capturarDado() {
        return Double.parseDouble(df.format((((double) looca.getMemoria().getEmUso()) /
                        ((double) looca.getMemoria().getTotal())) * 100)
                .replace(",", "."));
    }
}
