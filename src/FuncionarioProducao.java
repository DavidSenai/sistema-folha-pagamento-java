public class FuncionarioProducao extends Funcionario {

    int quantidade;
    double valorPeca;

    public FuncionarioProducao(int registro, String nome, int quantidade, double valorPeca) {
        super(registro, nome);
        this.quantidade = quantidade;
        this.valorPeca = valorPeca;
    }

    public double calcularSalario() {
        double bonus = quantidade * valorPeca;
        return SALARIO_BASE + bonus;
    }

    public void mostrarDados() {
        double bonus = quantidade * valorPeca;

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + registro);
        System.out.println("Salário Fixo: " + SALARIO_BASE);
        System.out.println("Produtividade: " + bonus);
        System.out.println("Salário final: " + calcularSalario());
    }
}