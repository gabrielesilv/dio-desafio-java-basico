package iphone.funcionalidade.telefone;

public class AtendendoTelefone implements AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO TELEFONE");
    }

    @Override
    public void iniciarCorreioVoz() {
    }
    
}
