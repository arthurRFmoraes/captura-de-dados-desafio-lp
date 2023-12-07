package school.sptech.model;

public class Disco extends Componente{
    public Disco(int id, String tipo, Double uso) {
        super(id, tipo, uso);
    }

    public Disco() {
    }

    @Override
    public Double capturarDado() {
        return Double.parseDouble((df.format(100.0 - (double) looca.getGrupoDeDiscos()
                .getVolumes().get(0).getDisponivel() / looca.getGrupoDeDiscos().getVolumes()
                .get(0).getTotal() * 100).replace(",", ".") ));
    }
}
