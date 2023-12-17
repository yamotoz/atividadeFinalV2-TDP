public class Main {
    public static void main(String[] args){
        Cliente merdinha = new Cliente();
        merdinha.setNome("corno");
        merdinha.setSaldo(350);
        Conta merdcard = new Conta();
        Operacao op1 = new Operacao(230,null,100);
        Operacao op2 = new Operacao(230,null,650);
        try{
            merdcard.adicionarvalor(op1);
            merdcard.adicionarvalor(op2);
        }catch(OperacaoDuplicadaException o){
            System.out.println("operacao duplicada");
        } catch(ValorinvalidoException v){
            System.out.println("valor errado");
        }


        
    }
}
