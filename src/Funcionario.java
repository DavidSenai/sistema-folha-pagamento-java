public class Funcionario {

    int registro;
    String nome;

    static final double SALARIO_BASE = 2000.0;

    public Funcionario(int registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }

    public double calcularSalario() {
        return SALARIO_BASE;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + registro);
        System.out.println("Salário Fixo: " + SALARIO_BASE);
        System.out.println("Extras: 0.0");
        System.out.println("Salário final: " + calcularSalario());
    }
}