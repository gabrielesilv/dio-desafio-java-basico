package iphone.multifuncional;

import iphone.funcionalidade.musica.ReprodutorMusical;
import iphone.funcionalidade.navegador.NavegadorInternet;
import iphone.funcionalidade.telefone.AparelhoTelefonico;

public class Smartphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    //Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A URL DA PÁGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }

    //Musica
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MÚSICA: " + musica);
    }

    //Telefone
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PELO NÚMERO: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    
}
