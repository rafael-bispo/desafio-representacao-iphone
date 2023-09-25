public class AppTelefone extends Aplicativo{
    @Override
    public void abrirApp() {
        System.out.println("O Telefone está aberto!");
    }

    @Override
    public void fecharApp() {
        System.out.println("O Telefone foi fechado!");
    }

    public void ligar(){
        System.out.println("Realizando ligação!");
    }
    public void atender(){
        System.out.println("Atendendo ligação!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o correio de voz!");
    }
    public void encerrarLigacao(){
        System.out.println("Ligação encerrada!");
    }
}
