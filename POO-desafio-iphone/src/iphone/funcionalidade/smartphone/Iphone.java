package iphone.funcionalidade.smartphone;

import iphone.funcionalidade.musica.ReprodutorMusical;
import iphone.funcionalidade.navegador.NavegadorInternet;
import iphone.funcionalidade.telefone.AparelhoTelefonico;
import iphone.multifuncional.Smartphone;

public class Iphone {
    public static void main(String[] args) {

        Smartphone iphone = new Smartphone();

        NavegadorInternet internet = iphone;
        ReprodutorMusical musica = iphone;
        AparelhoTelefonico telefone = iphone;

        internet.exibirPagina("www.implementacaoiphone.com.br");
        internet.adicionarNovaAba();
        internet.atualizarPagina();

        musica.tocar();
        musica.pausar();
        musica.selecionarMusica("Ivy - Frank Ocean");

        telefone.ligar("96643-5067");
        telefone.atender();
        telefone.iniciarCorreioVoz();

    }
}
