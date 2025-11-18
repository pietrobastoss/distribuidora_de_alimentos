public class Main{
    public static void main(String[] args) {

        // ERRO: nome da classe escrita errado
        Funcionario mot = new Motrista("João", 2500.0, 12);

        // ERRO: número de argumentos errado
        Funcionario ger = new Gerente("Maria", 5000.0);

        // ERRO: método inexistente
        mot.mostarDados();
        
        System.out.println("Pagamento gerente: " + ger.calcularPagamentoMensal()

        // ERRO: falta fechar chave
}
 {
    
}
