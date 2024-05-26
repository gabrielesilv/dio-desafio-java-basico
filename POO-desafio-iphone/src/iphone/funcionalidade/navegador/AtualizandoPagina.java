package iphone.funcionalidade.navegador;

public class AtualizandoPagina implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
    }

    @Override
    public void adicionarNovaAba() {
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
    
}
