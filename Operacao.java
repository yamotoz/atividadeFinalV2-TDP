public class Operacao {
    private int codigo;
    private String tipo;
    private float valor;

 public Operacao(int codigo, String tipo, float valor) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.valor = valor;
    }

    //Gets e Sets
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}