public class Motorista extends Funcionario {

    private int numeroDeEntregas;
    private static final double BONUS_ENTREGA = 10.0;

    public Motorista(String nome, double salarioBase, int entregas) {
        super(nome, salarioBase);
        this.numeroDeEntregas = entregas;
    }

    @Override
    public double calcularPagamentoMensal() {
        return salarioBase + BONUS_ENTREGA * numeroDeEntregas;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Entregas: " + numeroDeEntregas);
        System.out.println("Pagamento Mensal: " + calcularPagamentoMensal());
    }
}