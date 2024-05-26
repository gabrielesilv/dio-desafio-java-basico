package iphone.funcionalidade.musica;

public class PausandoMusica implements ReprodutorMusical{

    @Override
    public void tocar() {
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
    }
    
}
