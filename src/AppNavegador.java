public class AppNavegador extends Aplicativo{
    @Override
    public void abrirApp() {
        System.out.println("O Navegador está aberto!");
    }

    @Override
    public void fecharApp() {
        System.out.println("O Navegador foi fechado!");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba foi aberta!");
    }
    public void exibirPagina(){
        System.out.println("Exibindo página!");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página!");
    }
}
