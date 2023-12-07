package school.sptech.model;

public class Cpu extends Componente{

    public Cpu(int id, String tipo, Double uso) {
        super(id, tipo, uso);
    }

    public Cpu() {}

    @Override
    public Double capturarDado() {
        return Double.parseDouble(df.format(looca.getProcessador().getUso())
                .replace(",", "."));
    }

}
