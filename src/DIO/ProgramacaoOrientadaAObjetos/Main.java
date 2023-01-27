package DIO.ProgramacaoOrientadaAObjetos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("branco", "fusca", 30);
        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(5.459f));

        carro.setCor("vermelho");
        carro.setModelo("F50");
        carro.setCapacidadeTanque(60);
        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(5.459f));

        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor = (Vendedor) new Funcionario(); //atenção! evitar!



    }
}
