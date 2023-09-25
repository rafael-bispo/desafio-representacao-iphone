public class Iphone {
    public static void main(String[] args) {

        //Iniciando os objetos
        AppReprodutorMusical reprodutorMusical = new AppReprodutorMusical();
        AppNavegador navegador = new AppNavegador();
        AppTelefone telefone = new AppTelefone();

        //Testando as funções de cada "App"

        //Reprodutor musical
        reprodutorMusical.abrirApp();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.fecharApp();

        System.out.println();
        System.out.println();

        //Navegador de Internet
        navegador.abrirApp();
        navegador.adicionarNovaAba();
        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.fecharApp();

        System.out.println();
        System.out.println();

        //Telefone
        telefone.abrirApp();
        telefone.ligar();
        telefone.encerrarLigacao();
        telefone.atender();
        telefone.encerrarLigacao();
        telefone.iniciarCorreioVoz();
        telefone.encerrarLigacao();
        telefone.fecharApp();
    }
}