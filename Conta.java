import java.util.ArrayList;
public class Conta {
    private int codigo;
    private Cliente cliente;
    private ArrayList<Operacao> lista = new ArrayList<Operacao>();

public void adicionarvalor(Operacao o)

throws  OperacaoDuplicadaException, ValorinvalidoException{
    if(lista.contains(o)){
        throw new OperacaoDuplicadaException();
    }
    if(o.getValor()==0){
        throw new ValorinvalidoException();
    }
    lista.add(o);
}
public Operacao retornar(int i){
      return lista.get(i);
}
}    

