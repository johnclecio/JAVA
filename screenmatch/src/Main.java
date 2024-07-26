

public class Main {
    public static void main(String[] args) {
     /*   Pessoa pessoa1 = new Pessoa();
        Calculadora soma = new Calculadora();
        Musica musicas = new Musica();
        Carro carro = new Carro();

        ContaBancaria contas = new ContaBancaria();*/
        /*IdadePessoa idadePessoa = new IdadePessoa();
        Produto produto = new Produto();
        Livro livro = new Livro();

        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);
        Aluno aluno3 = new Aluno("John", 10, 8.5, 9.9 );

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println();

        System.out.println("Aluno 3:");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Nota 1: " + aluno3.getNota1());
        System.out.println("Nota 2: " + aluno3.getNota2());
        System.out.println("Nota 3: " + aluno3.getNota3());
        System.out.println("Média: " + aluno3.calcularMedia());*/

       /* musicas.titulo = "Nave sepacial ";
        musicas.artista = "LIU";
        musicas.anoDeLancamento = 2019;

        carro.modelo = "FIAT";
        carro.anoLancamento = 2014;
        carro.cor = "Preta";


        musicas.fichatecnica();
        musicas.avaliado(10);
        musicas.avaliado(8);
        musicas.avaliado(9);
        musicas.avaliado(10);

        musicas.pegaMedia();
        System.out.println(musicas.pegaMedia());


        pessoa1.frase();
        carro.descricao();
        carro.idadeTotal();
        System.out.println(carro.idadeTotal());


        soma.quadrado();
        System.out.println(soma.quadrado());

        aluno.nome = "john";
        aluno.idade = 31;
        aluno.serie = "1 Ano";
        aluno.n1 = 10;
        aluno.n2 = 8;
        aluno.n3 = 6;
        aluno.n4 = 9;

        aluno.fichaAluno();
        aluno.media();
        System.out.println(aluno.media());

        contas.setNumeroConta(2014);
        contas.setSaldo(1.420);
        contas.setTitula("john");
        System.out.println("Titula da Conta: \n" + contas.getTitula());
        System.out.println("Numero da Conta: \n" + contas.getNumeroConta());
        System.out.println("Saldo da Conta: \n" + contas.getSaldo()); */
/*
        idadePessoa.setNome("John");
        idadePessoa.maiorDeIdade(17);


        System.out.println( idadePessoa.getNome() + "\n");

        produto.setNome("Iphone XR");
        produto.setPreco(5000);
        produto.aplicarDesconto();


        System.out.println(produto.getNome() + "\n" + produto.getPreco());


        livro.setNome("John");
        livro.setTitulo("Abracadabra");


        System.out.println("Autor:");
        System.out.println(livro.getNome());
        System.out.println("Titulo:");
        System.out.println(livro.getTitulo());


        Cachorro cachorro = new Cachorro();
        System.out.println("Cachorro");
        cachorro.emitirSom();
        cachorro.abanaORabo();

        Gato gato = new Gato();
        System.out.println("Gato");
        gato.emitirSom();
        gato.arranharOsMoveis(); */

     /*   ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();



        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(29);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(29);
        System.out.println("O próximo primo após 29 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);*/


        ConversorMoeda conversorMoeda = new ConversorMoeda();

        conversorMoeda.setDolar(5);
        conversorMoeda.getDolar();

        System.out.println(conversorMoeda.converterDolarParaReal());

        conversorMoeda.setReal(5);
        conversorMoeda.getReal();

        System.out.println(conversorMoeda.converterRealParaDolar());


        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.setBase(5.5);
        calculadoraSalaRetangular.getBase();
        calculadoraSalaRetangular.setAltura(8.5);
        calculadoraSalaRetangular.getAltura();
        System.out.println("Calcular Area");

        System.out.println(calculadoraSalaRetangular.calcularArea());

        System.out.println("Calcular perimentro");


        calculadoraSalaRetangular.setBase(5.5);
        calculadoraSalaRetangular.getBase();
        calculadoraSalaRetangular.setAltura(8.5);
        calculadoraSalaRetangular.getAltura();
        System.out.println(calculadoraSalaRetangular.calcularPerimetro());

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.setNumero(3);
        tabuadaMultiplicacao.getNumero();
        System.out.println(tabuadaMultiplicacao.mostrarTabuada());



        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.setValorCelsius(31);
        conversorTemperaturaPadrao.getValorCelsius();


        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit());

        conversorTemperaturaPadrao.setValorFahrenheit(31);
        conversorTemperaturaPadrao.getValorFahrenheit();
        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius());


        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setValor(100);
        produtoFisico.getValor();
        System.out.println(produtoFisico.calcularPrecoFinal());

        Livro livro = new Livro();
        livro.setTitulo("John");
        livro.getTitulo();
        livro.setNome("O Garoto");
        livro.getNome();
        livro.setValor1(90);
        livro.getValor1();
        livro.setValor2(300);

        System.out.println(livro.calcularPrecoFinal());


       Servico servico = new Servico();
       servico.setPrecoHora(100);
       servico.getPrecoHora();

        System.out.println(servico.calcularPrecoTotal(10));
        System.out.println(servico.aplicarDesconto(10));



       Produto produto = new Produto();
       produto.setPrecoUnitario(22);
       produto.getPrecoUnitario();

        System.out.println(produto.calcularPrecoTotal(18));
        System.out.println(produto.aplicarDesconto(5));





    }


}
