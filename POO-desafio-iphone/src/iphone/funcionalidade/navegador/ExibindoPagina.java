package iphone.funcionalidade.navegador;

public class ExibindoPagina implements NavegadorInternet {

    @Override
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
    }

    @Override
    public void atualizarPagina() {
    }
}
