package iphone.funcionalidade.musica;

public class TocandoMusica implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
    }

    @Override
    public void selecionarMusica(String musica) {
    }
    
}
