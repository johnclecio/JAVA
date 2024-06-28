
//Conta Bancaria

// 1 Parte
//***********************
//Dados iniciais do cliente:
//
//Nome: Jacqueline Oliveira
//Tipo conta: Corrente
//Saldo inicial: R$ 2500,00
//***********************


// 2 parte
//Operações
//
//1- Consultar saldos
//2- Receber valor
//3- Transferir valor
//4- Sair
//
//Digite a opção desejada:

import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {

        // variaveis
        Scanner scanner = new Scanner(System.in);
        double saldo = 2500.00;
        String tipoDeConta = "Corrente";
        String name = "John Clecio Fideles ";
        int op = 0 ;

        String bemVindo = """
                       Banco Mac
                """;
        System.out.println(bemVindo);



                String msg = """
                ***********************
                 Dados iniciais do cliente:
                """ + " Name: " + name + "\n "+ "Tipo conta: "
                        + tipoDeConta + "\n" + " Saldo inicial: "+ saldo  + "\n"
                        + "***********************";

                System.out.println(msg);

                String menu = """
                        1- Consultar saldos
                        2- Receber valor
                        3- Transferir valor
                        4- Sair
                        """;

                //Operações
                while (op != 4){
                    System.out.println(menu);
                     op = scanner.nextInt();

                    switch (op){
                        case 1 :
                            System.out.println("Seu Saldo \n" + saldo);
                            break;
                        case 2:
                            System.out.println("Digite o valor");
                            double receberValor = scanner.nextDouble();
                            double saldoNovo = saldo + receberValor;
                            if (receberValor <= 0){
                                System.out.println("Valor Invalido");
                            }else {
                                System.out.println("Seu Saldo \n" + saldoNovo);
                            }

                            break;
                        case 3:
                            System.out.println("Tranferencia Via Pix");
                            System.out.println("Digite o valor a ser Transferido");
                            double tranferenciaPix = scanner.nextDouble();
                            double transferencia = saldo - tranferenciaPix;

                            if (tranferenciaPix > saldo || tranferenciaPix <= 0){
                                System.out.println("Valor Invalido");

                            }else {
                                System.out.println("Seu saldo \n" + transferencia);
                            }

                            break;

                        default:
                            if (op == 4){
                                System.out.println("Obrigado ");
                            }else {
                                System.out.println("Opção inválida.");
                            }

                            break;

                    }

                }




            }
        }



