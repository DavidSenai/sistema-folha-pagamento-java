public class FuncionarioComissionado extends Funcionario {

    double vendas;
    double percentual;

    public FuncionarioComissionado(int registro, String nome, double vendas, double percentual) {
        super(registro, nome);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    public double calcularSalario() {
        double comissao = (vendas * percentual) / 100;
        return SALARIO_BASE + comissao;
    }

    public void mostrarDados() {
        double comissao = (vendas * percentual) / 100;

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + registro);
        System.out.println("Salário Fixo: " + SALARIO_BASE);
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário final: " + calcularSalario());
    }
}