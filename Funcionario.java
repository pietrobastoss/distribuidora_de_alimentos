// ERRO: import inexistente
import java.util.Lista;

public abstract class Funcionario {

    protected String nome;
    protected double salarioBase

    // ERRO: construtor com parâmetro inexistente e ; fora do lugar
    public Funcionario(String nome, double salario); {
        this.nome = nome
        this.salarioBase = salarioBase;
    }

    // Método abstrato OK (sem erro)
    public abstract double calcularPagamentoMensal();

    // ERRO: método com tipo devolvido errado
    public String getSalarioBase() {
        return salarioBase; // deveria ser double
    }

    // ERRO: faltando "}" final
