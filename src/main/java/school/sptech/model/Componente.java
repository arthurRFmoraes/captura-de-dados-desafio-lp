package school.sptech.model;

import com.github.britooo.looca.api.core.Looca;

import java.text.DecimalFormat;

public abstract class Componente {
    private int id;
    private String tipo;
    private Double uso;

    public Componente(int id, String tipo, Double uso) {
        this.id = id;
        this.tipo = tipo;
        this.uso = uso;
    }
    protected static Looca looca = new Looca();

    public static DecimalFormat df = new DecimalFormat("0.00");

    public Componente() {}

    public abstract Double capturarDado();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getUso() {
        return uso;
    }

    public void setUso(Double uso) {
        this.uso = uso;
    }
}
