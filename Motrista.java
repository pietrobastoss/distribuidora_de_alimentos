
// ERRO: classe escrita errado
public class Motrista extends Funcionario {

    private int numeroDeEntregas;

    // ERRO: construtor chamando super errado
    public Motorista(String nome, double salarioBase, int entregas) {
        super(nome); // está faltando salário
        numeroDeEntregas = entregas
    }

    // Implementação do método abstrato
    @Override
    public double calcularPagamentoMensal() {
        // ERRO: variável inexistente
        return salarioBase + bonusEntrega * numeroDeEntregas
    }

    // método com erro
    public void imprimirDados()
        System.out.println("Nome: " + nome)
        System.out.println("Entregas: " + numeroDeEntregas);
    }
}
