public class Gerente extends Funcionario {

    private double bonusf;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase)
        this.bonus = bonus; // ERRO: nome do atributo errado
    }

    @Override
    public double calcularPagamentoMensal() {
        // ERRO: ponto e vírgula dentro da expressão
        return salarioBase + bonusf;;
    }
}
