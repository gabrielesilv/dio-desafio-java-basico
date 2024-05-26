package iphone.funcionalidade.telefone;

public class LigandoTelefone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PELO TELEFONE");
    }

    @Override
    public void atender() {
    }

    @Override
    public void iniciarCorreioVoz() {
    }

}
